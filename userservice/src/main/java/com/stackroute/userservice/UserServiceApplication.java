package com.stackroute.userservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class UserServiceApplication {
    public static void main(String[] args) {

        SpringApplication.run(UserServiceApplication.class, args);
    }
}
//    @RefreshScope
//    @RestController
//    class MessageRestController {
//
//        @Value("${msg:Hello world - Config Server is not working..pelase check}")
//        private String msg;
//
//        @RequestMapping("/msg")
//        String getMsg() {
//            return this.msg;
//        }
//    }


