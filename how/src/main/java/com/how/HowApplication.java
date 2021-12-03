package com.how;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description:
 * @Author: 坚持的力量
 * @Date: 2021/12/3 14:30
 * @Version: 11
 */
@SpringBootApplication
@EnableDiscoveryClient
public class HowApplication {
    public static void main(String[] args) {
        SpringApplication.run(HowApplication.class, args);
    }

}
