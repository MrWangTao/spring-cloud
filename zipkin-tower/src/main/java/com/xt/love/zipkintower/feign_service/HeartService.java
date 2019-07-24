package com.xt.love.zipkintower.feign_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Create User: wangtao
 * Create In 2019-07-19 09:56
 * Description:
 **/
@FeignClient("zipkin-heart")
public interface HeartService {

    @RequestMapping(value = "/heart/love", method = RequestMethod.GET)
    String heart();

}
