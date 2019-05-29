package com.stackroute.muzixapplication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication

@EnableEurekaClient


public class MuzixApplication {
    public static void main(String[] args) {

        SpringApplication.run(MuzixApplication.class, args);
    }
}

//}
//    @RefreshScope
//    @RestController
//    class MessageRestController {
//
//        @Value("${msg:Hello world - Config Server is not working..please check}")
//        private String msg;

//        @RequestMapping("/msg")
//        String getMsg() {
//            return this.msg;
//        }

//    }

//}



