package com.nala.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.nala")
@MapperScan("com.nala.mapper")
public class SpringbootthymleafaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootthymleafaApplication.class, args);
    }

}
