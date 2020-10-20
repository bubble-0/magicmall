package com.magic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Magic
 * @EnableDiscoveryClient 添加eurkaclient的注解 和  @EnableEurekaClient 等价,
 * 不过EnableDiscoveryClient 可以是任何注册中心 EnableEurekaClient 只能是eureka
 */

@SpringBootApplication
@EnableDiscoveryClient
public class MagicItemServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(MagicItemServiceApplication.class, args);
    }

}
