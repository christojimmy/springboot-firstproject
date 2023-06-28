package com.dockerspringbootproject.dockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/")
    public String firstApi() {
        return "Welcome to the dockerspringboot project";
    }
}
