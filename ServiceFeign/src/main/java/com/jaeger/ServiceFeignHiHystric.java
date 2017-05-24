package com.jaeger;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2017/5/24.
 */
@Component
public class ServiceFeignHiHystric implements ServiceFeignHiInterface {
    @Override
    public String sayHiFromFeignClient(@RequestParam(value = "name") String name) {
        return "Feign error: " + name;
    }
}
