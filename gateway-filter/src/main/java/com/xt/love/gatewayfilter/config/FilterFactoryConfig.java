package com.xt.love.gatewayfilter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Create User: wangtao
 * Create In 2019-07-24 16:55
 * Description:
 **/
@Configuration
public class FilterFactoryConfig {

    @Bean
    public RequestTimeGatewayFilterFactory requestTimeGatewayFilterFactory() {
        return new RequestTimeGatewayFilterFactory();
    }

}
