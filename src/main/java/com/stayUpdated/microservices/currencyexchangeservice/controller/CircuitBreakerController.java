package com.stayUpdated.microservices.currencyexchangeservice.controller;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CircuitBreakerController {

    private final Logger logger = LoggerFactory.getLogger(CircuitBreakerController.class);
    @GetMapping("/api/circuitbreaker")
    //@Retry(name = "simpleApi", fallbackMethod = "fallbackResponse")
    @CircuitBreaker(name = "simpleApi", fallbackMethod = "fallbackResponse")
    public String simpleApi(){
        logger.info("Inside simpleApi");
        ResponseEntity<String> forEntity = new RestTemplate().getForEntity("http://localhost:8080/dummy-url", String.class);
        return forEntity.getBody();
    }

    public String fallbackResponse(Exception ex){
        logger.info("Inside fallbackResponse");
        return "fallbackResponse";
    }
}
