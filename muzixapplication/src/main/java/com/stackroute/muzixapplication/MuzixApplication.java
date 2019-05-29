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
<<<<<<< HEAD
@EnableEurekaClient

=======
>>>>>>> daf91d8a2d5a0572f006e93ba59d17afa768ca08
public class MuzixApplication {
    public static void main(String[] args) {

        SpringApplication.run(MuzixApplication.class, args);
    }
}
<<<<<<< HEAD
=======
//}
>>>>>>> daf91d8a2d5a0572f006e93ba59d17afa768ca08
//    @RefreshScope
//    @RestController
//    class MessageRestController {
//
//        @Value("${msg:Hello world - Config Server is not working..please check}")
//        private String msg;
<<<<<<< HEAD
//
=======
>>>>>>> daf91d8a2d5a0572f006e93ba59d17afa768ca08
//        @RequestMapping("/msg")
//        String getMsg() {
//            return this.msg;
//        }
<<<<<<< HEAD
//    }
=======
//}
>>>>>>> daf91d8a2d5a0572f006e93ba59d17afa768ca08


