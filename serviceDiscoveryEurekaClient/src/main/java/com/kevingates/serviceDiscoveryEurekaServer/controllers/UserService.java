package com.kevingates.serviceDiscoveryEurekaServer.controllers;

import com.kevingates.serviceDiscoveryEurekaServer.config.LoadBalancerConfiguration;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "product-service")
@LoadBalancerClient(name = "product-service", configuration= LoadBalancerConfiguration.class)
public interface UserService {
    @RequestMapping(value = "/users/index", method = RequestMethod.GET)
    String index();
}