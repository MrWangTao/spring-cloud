package com.xt.love.hystrixfeign.controller;

import com.xt.love.hystrixfeign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create User: wangtao
 * Create In 2019-07-18 10:32
 * Description:
 **/
@RestController
@RequestMapping("/feign")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public String test() {
        return userService.users();
    }

}
