package com.jaeger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/5/24.
 */
@RestController
public class ConfigClientController {
    @Value("${car}")
    String carName;
    @RequestMapping(value = "/carName")
    public String carName(){
        return carName;
    }
}
