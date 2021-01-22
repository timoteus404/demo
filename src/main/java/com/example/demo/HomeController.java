package com.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "My First Spring Framework Hello World App";
    }
}
