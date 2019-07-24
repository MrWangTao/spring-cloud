package com.xt.love.ribbon.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

/**
 * Create User: wangtao
 * Create In 2019-07-18 09:59
 * Description:
 **/
@Configuration
public class BootConfig {

    /**
     * 需要添加 @LoadBalanced 否则会出现报错
     *
     * I/O error on GET request for "http://eureka-client-user/users": eureka-client-user: nodename nor servname provided, or not known;
     * nested exception is java.net.UnknownHostException: eureka-client-user: nodename nor servname provided, or not known
     *
     * @LoadBalanced 默认采用轮询的方式
     *
     * @param builder
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.setReadTimeout(Duration.ofSeconds(5)).setConnectTimeout(Duration.ofSeconds(5)).build();
    }

}
