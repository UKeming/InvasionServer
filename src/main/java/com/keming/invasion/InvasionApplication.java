package com.keming.invasion;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.keming.invasion")
public class InvasionApplication {

    public static void main(String[] args) {
        SpringApplication.run(InvasionApplication.class, args);
    }

}
