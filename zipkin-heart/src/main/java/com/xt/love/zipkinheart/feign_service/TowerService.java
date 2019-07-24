package com.xt.love.zipkinheart.feign_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Create User: wangtao
 * Create In 2019-07-19 09:56
 * Description:
 **/
@FeignClient(value = "zipkin-tower")
public interface TowerService {

    @RequestMapping(value = "/tower/love", method = RequestMethod.GET)
    String tower();

}
