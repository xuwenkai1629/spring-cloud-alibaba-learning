package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 消费者
 *
 * @author xu wen kai
 * @date 2022/07/15 11:41
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DiscoveryConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryConsumerApplication.class, args);
    }
}
