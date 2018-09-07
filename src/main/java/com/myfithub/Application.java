package com.myfithub;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
//@ImportResource("classpath:spring-security-config.xml")
@MapperScan("com.myfithub.mapper")
@EnableTransactionManagement

public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
