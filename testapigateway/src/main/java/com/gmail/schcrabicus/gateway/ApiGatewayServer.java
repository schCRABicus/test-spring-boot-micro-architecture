package com.gmail.schcrabicus.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Entry point to API Gateway Server
 * @author <a href="mailto:mikalai.lushchytski@altoros.com">Mikalai Lushchytski</a>
 */
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class ApiGatewayServer {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayServer.class, args);
    }
}
