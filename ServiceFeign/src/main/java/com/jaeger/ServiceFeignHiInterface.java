package com.jaeger;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2017/5/24.
 */
@FeignClient(value = "service-hi", fallback = ServiceFeignHiHystric.class)
public interface ServiceFeignHiInterface {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromFeignClient(@RequestParam(value = "name") String name);
}
