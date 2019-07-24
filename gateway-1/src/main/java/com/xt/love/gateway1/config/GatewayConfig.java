package com.xt.love.gateway1.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Create User: wangtao
 * Create In 2019-07-19 11:12
 * Description:
 **/
@Configuration
public class GatewayConfig {

    /**
     * 如果有很多个Predicate，并且一个请求满足多个Predicate，则按照配置的顺序第一个生效。
     *
     * @param builder
     * @return
     */
    @Bean
    public RouteLocator routing(RouteLocatorBuilder builder) {
        // 使用 http://httpbin.org/ 验证代理地址, 可以返回当前使用的一些网络信息
        String httpUri = "http://localhost:8071";
        return builder.routes()
                .route(p -> p
                        .path("/tower/love")   // 这个路径会追加带uri后面
                        .filters(f -> f.addRequestHeader("HI", "IT'S ME"))
                        // .uri("http://httpbin.org:80")
                        .uri(httpUri)
                )
                // 注意这里的host不是说包含某个值就重定向到fallback地址，而是当我们制定的host宕机或者不存在的时候，跳转到我们的回调函数中
                .route(p -> p
                        .host("*.hystrix.com")
                        .filters(f -> f
                                .hystrix(config -> config
                                        .setName("mycmd")
                                        .setFallbackUri("forward:/fallback")))
                        .uri(httpUri))
                .build();
        // 使用自定义过滤器
        /*return builder.routes()
                .route(p ->
                        p.path("/tower")
                        .filters(f -> f.filter(new MyRouteFilter()).addRequestHeader("hello","world"))
                        .uri("http://localhost:8071"))
                .build();*/
    }

}
