package com.stackroute.userservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@ComponentScan
=======
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
>>>>>>> 8d82c27c879aebfae3b25b9be71f87d617cc4aa0
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


