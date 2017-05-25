package com.jaeger;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2017/5/25.
 */
@RestController
public class ServiceHiZipkinController {

    private static final Logger LOG = Logger.getLogger(ServiceHiZipkinController.class.getName());

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @RequestMapping("/zipkinHi")
    public String callHome(){
        LOG.log(Level.INFO, "zipkinHi is being called");
        return restTemplate.getForObject("http://localhost:8989/zinkinMiya", String.class);
    }

    @RequestMapping("/zipkinHiInfo")
    public String info(){
        LOG.log(Level.INFO, "zipkinHiInfo is being called");
        return "i'm zipkinHiInfo";
    }
}
