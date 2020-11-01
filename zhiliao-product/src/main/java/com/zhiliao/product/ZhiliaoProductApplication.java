package com.zhiliao.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zhiliao.product.dao")
@SpringBootApplication
public class ZhiliaoProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhiliaoProductApplication.class, args);
    }

}
