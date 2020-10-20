package com.magic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 网关
 *
 * @author Magic
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class MagicGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MagicGatewayApplication.class, args);

    }
}
