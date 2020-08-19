package com.vasu.SpringBootProfile.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
    @Value("${name}")
    private String name;
     
    @GetMapping("/profile")
    public String testProfile() {
        return "Current Envirnment is "+ name;
    }
}
