package com.xt.love.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create User: wangtao
 * Create In 2019-07-18 14:43
 * Description:
 **/
@RestController
@RequestMapping("/config")
public class ConfigController {

    @Value("${com.xt.love.type}")
    private String value;

    @GetMapping
    public String property() {
        return value;
    }

}
