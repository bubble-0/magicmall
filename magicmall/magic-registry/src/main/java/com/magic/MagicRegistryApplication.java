package com.magic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心
 * @author Magic
 */

@SpringBootApplication
@EnableEurekaServer
public class MagicRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(MagicRegistryApplication.class, args);

    }
}
