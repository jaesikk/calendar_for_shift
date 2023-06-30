package com.cfs.gateway.apigateway.global;


import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class FilterConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder){

        return builder.routes()
                .route(r -> r.path("/first-service/**")
                        .filters(f -> f.addRequestHeader("first-request", "first-request-header")
                                .addResponseHeader("first-response", "first-response-header"))
                        .uri("http://localhost:8081/"))
                .route(r -> r.path("/second-service/**")
                        .filters(f -> f.addRequestHeader("second-request", "second-request-header")
                                .addResponseHeader("second-response", "second-response-header"))
                        .uri("http://localhost:8082/"))
                .route(r -> r.path("/member-service/**")
                        .filters(f -> f.addRequestHeader("member-request", "member-request-header")
                                .addResponseHeader("member-response", "member-response-header"))
                        .uri("http://localhost:7000/"))
                .route(r -> r.path("/community-service/**")
                        .filters(f -> f.addRequestHeader("community-request", "community-request-header")
                                .addResponseHeader("community-response", "community-response-header"))
                        .uri("http://localhost:8084/"))
                .build();


    }
}
