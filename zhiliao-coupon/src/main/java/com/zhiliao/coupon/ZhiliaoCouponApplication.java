package com.zhiliao.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ZhiliaoCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhiliaoCouponApplication.class, args);
    }

}
