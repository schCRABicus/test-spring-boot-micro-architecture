package com.gmail.schcrabicus.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Config Server entry point
 * @author <a href="mailto:schCRABicus@gmail.com">Mikalai Lushchytski</a>
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServer {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServer.class, args);
    }
}
