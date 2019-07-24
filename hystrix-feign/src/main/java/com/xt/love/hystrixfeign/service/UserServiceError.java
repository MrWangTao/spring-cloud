package com.xt.love.hystrixfeign.service;

import org.springframework.stereotype.Service;

/**
 * Create User: wangtao
 * Create In 2019-07-18 11:18
 * Description: 需要实现实现熔断注解的接口， 并且这个类要交给Spring容器管理
 **/
@Service
public class UserServiceError implements UserService {

    @Override
    public String users(){
        return "handle user error";
    }

}
