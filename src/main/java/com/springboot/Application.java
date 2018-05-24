package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hp on 2018/5/24.
 */
@SpringBootApplication
public class Application {

    @RequestMapping("/")
    public String index(){
        return "Spring Boot Application...";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
