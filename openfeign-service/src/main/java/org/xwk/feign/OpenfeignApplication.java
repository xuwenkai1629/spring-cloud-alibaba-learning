package org.xwk.feign;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author xuwenkai
 */
@SpringBootApplication
@EnableFeignClients(basePackages = {"org.xwk.feign.service"})
@MapperScan("org.xwk.feign.mapper")
@EnableDiscoveryClient
public class OpenfeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenfeignApplication.class, args);
    }
}