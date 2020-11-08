package com.zhiliao.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.zhiliao.product.dao")
@EnableDiscoveryClient//开启服务注册发现
@SpringBootApplication
public class ZhiliaoProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhiliaoProductApplication.class, args);
    }

}
