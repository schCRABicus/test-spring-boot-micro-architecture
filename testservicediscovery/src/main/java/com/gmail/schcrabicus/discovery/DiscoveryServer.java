package com.gmail.schcrabicus.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Entry point to application Discovery Server
 * @author <a href="mailto:mikalai.lushchytski@altoros.com">Mikalai Lushchytski</a>
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServer {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServer.class, args);
    }
}
