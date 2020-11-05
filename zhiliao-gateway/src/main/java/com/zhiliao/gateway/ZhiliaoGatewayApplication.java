package com.zhiliao.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient//开启服务注册发现
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})//排除zhiliao-common中的mybatis配置
public class ZhiliaoGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhiliaoGatewayApplication.class, args);
    }

}
