package com.xt.love.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Create User: wangtao
 * Create In 2019-07-18 10:28
 * Description: @FeignClient(value = "eureka-client-user")
 * @FeignClient 注解中属性value，表示注册到Eureka-Servce上的spring.application.name的值为xxx的Eureka-client的服务名称
 **/
@FeignClient("eureka-client-user")
public interface UserService {

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    String users();

}
