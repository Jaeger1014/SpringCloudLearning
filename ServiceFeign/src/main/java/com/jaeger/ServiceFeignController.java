package com.jaeger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/5/24.
 */
@RestController
public class ServiceFeignController {
    @Autowired
    ServiceFeignHiInterface serviceFeignHiInterface;
    @RequestMapping(value = "/feignHi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return serviceFeignHiInterface.sayHiFromFeignClient(name);
    }
}
