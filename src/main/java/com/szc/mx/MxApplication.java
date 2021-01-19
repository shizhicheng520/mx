package com.szc.mx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.szc.dao")
public class MxApplication {

    public static void main(String[] args) {
        SpringApplication.run(MxApplication.class, args);
    }

}
