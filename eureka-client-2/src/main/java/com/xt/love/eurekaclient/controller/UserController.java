package com.xt.love.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create User: wangtao
 * Create In 2019-07-18 09:47
 * Description:
 **/
@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String test() {
        return "this is test method from eureka-client-2";
    }

}
