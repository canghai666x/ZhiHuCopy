package com.canghai.zhihucopy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.canghai.zhihucopy.mapper.")
public class ZhihucopyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhihucopyApplication.class, args);
    }

}
