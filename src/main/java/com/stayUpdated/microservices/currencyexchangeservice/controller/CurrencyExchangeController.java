package com.stayUpdated.microservices.currencyexchangeservice.controller;

import com.stayUpdated.microservices.currencyexchangeservice.data.CurrencyExchange;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retrieveExchangeValue(@PathVariable String from,@PathVariable String to){

        return null;
    }
}