package com.gmail.schcrabicus.calculation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Entry point to calculation server
 * @author <a href="mailto:mikalai.lushchytski@altoros.com">Mikalai Lushchytski</a>
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CalculationServer {

    public static void main(String[] args) {
        SpringApplication.run(CalculationServer.class, args);
    }
}
