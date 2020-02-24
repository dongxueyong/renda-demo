package com.jeesoul.rendademo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jeesoul.*.mapper")
public class RendaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RendaDemoApplication.class, args);
    }

}
