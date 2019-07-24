package com.xt.love.hystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    @HystrixCommand(fallbackMethod = "userError")
    public String user() {
        return restTemplate.getForObject("http://eureka-client-user/users", String.class);
    }


    /**
     * tips: 最好把断路器设置在service业务层
     *
     * 注意fallbackMethod的方法必须要和 @HystrixCommand 标注的方法一致，参数也要一致
     *
     * @return
     */
    public String userError() {
        return "request error";
    }

}
