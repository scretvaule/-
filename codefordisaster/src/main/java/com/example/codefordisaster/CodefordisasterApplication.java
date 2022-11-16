package com.example.codefordisaster;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.codefordisaster.mapper")
public class CodefordisasterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodefordisasterApplication.class, args);
    }

}
