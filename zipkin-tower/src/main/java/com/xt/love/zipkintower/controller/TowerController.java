package com.xt.love.zipkintower.controller;

import com.xt.love.zipkintower.feign_service.HeartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create User: wangtao
 * Create In 2019-07-19 09:58
 * Description:
 **/
@RestController
@RequestMapping("/tower")
public class TowerController {

    @Autowired
    private HeartService heartService;

    @GetMapping
    public String tower() {
        return heartService.heart();
    }

    @GetMapping("/love")
    public String love(@RequestHeader("hello") String hello) {
        System.out.println("******** " + hello);
        return "tower";
    }

    @RequestMapping("/fallback")
    public String fallback() {
        return "fallback";
    }

}
