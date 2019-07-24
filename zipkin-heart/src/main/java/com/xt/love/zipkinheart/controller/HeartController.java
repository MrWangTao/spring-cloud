package com.xt.love.zipkinheart.controller;

import com.xt.love.zipkinheart.feign_service.TowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create User: wangtao
 * Create In 2019-07-19 09:58
 * Description:
 **/
@RestController
@RequestMapping("/heart")
public class HeartController {

    @Autowired
    private TowerService towerService;

    @GetMapping
    public String tower() {
        return towerService.tower();
    }

    @GetMapping("/love")
    public String love() {
        return "heart";
    }

}
