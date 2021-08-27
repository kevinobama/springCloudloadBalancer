package com.kevingates.serviceDiscoveryEurekaServer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersControllers {

    @Autowired UserService UserService1;

    @GetMapping("/")
    public String index() {
        return "This is feign data:"+UserService1.index();
    }
}