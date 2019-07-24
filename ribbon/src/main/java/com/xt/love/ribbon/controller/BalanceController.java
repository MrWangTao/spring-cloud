package com.xt.love.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Create User: wangtao
 * Create In 2019-07-18 10:04
 * Description:
 **/
@RestController
@RequestMapping("/balance")
public class BalanceController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user")
    public String user() {
        return restTemplate.getForObject("http://eureka-client-user/users", String.class);
    }


}
