package com.jaeger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ServiceHiZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceHiZipkinApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

    @Bean
    public AlwaysSampler defaultSampler(){
        return new AlwaysSampler();
    }
}
