package com.fox;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * Hello world!
 */
@SpringBootApplication
@MapperScan("com.fox.mapper")
public class App {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(App.class, args);
    }
}
