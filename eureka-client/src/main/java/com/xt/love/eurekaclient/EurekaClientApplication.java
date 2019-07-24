package com.xt.love.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 服务（发现）注册客户端只添加@EnableEurekaClient是不行的，
 * 需要在yml中添加自己要注册的注册中心地址
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaClientApplication {

    public static void main(String[] args) {
         SpringApplication.run(EurekaClientApplication.class, args);
    }

}
