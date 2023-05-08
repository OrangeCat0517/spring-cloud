package com.example.springcloudclient1.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${username}")
    private String username;
    @RequestMapping("/")
    public String home() {
        return username;
    }
}
