package com.jaeger;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2017/5/25.
 */
@RestController
public class ServiceMiyaZipkinController {

    private static final Logger LOG = Logger.getLogger(ServiceMiyaZipkinController.class.getName());

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/zinkinMiya")
    public String home(){
        LOG.log(Level.INFO, "zinkinMiya is being called");
        return "hi i'm zinkinMiya!";
    }

    @RequestMapping("/zinkinMiyaInfo")
    public String info(){
        LOG.log(Level.INFO, "zinkinMiyaInfo is being called");
        return restTemplate.getForObject("http://localhost:8988/zipkinHiInfo",String.class);
    }


}
