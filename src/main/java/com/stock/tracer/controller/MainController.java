package com.stock.tracer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String response(){
        return "hello world";
    }

    @GetMapping("/hello")
    public String newResponse(){
        return "Hello Java";
    }

    @GetMapping("/merhaba")
    //@ResponseStatus(HttpStatus.GATEWAY_TIMEOUT)
    public String merhaba(@RequestParam String name){
        return "Hello "+name;
    }

}
