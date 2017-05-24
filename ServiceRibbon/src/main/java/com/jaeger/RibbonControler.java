package com.jaeger;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2017/5/24.
 */
@RestController
public class RibbonControler {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/ribbonHi")
    @HystrixCommand(fallbackMethod = "ribbonHiError")
    public String ribbonHi(@RequestParam String name){
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name, String.class);
    }

    public String ribbonHiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
