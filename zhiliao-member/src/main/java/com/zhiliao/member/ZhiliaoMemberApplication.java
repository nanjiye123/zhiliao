package com.zhiliao.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.zhiliao.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class ZhiliaoMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhiliaoMemberApplication.class, args);
    }

}
