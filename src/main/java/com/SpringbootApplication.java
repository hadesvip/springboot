package com;

import com.configuration.ApplicationConfig;
import com.controller.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootApplication {

    @Autowired
    private ApplicationConfig config;

    @RequestMapping("/")
    @ResponseBody
    public String hello() {
        System.out.println(config.getName() + "->" + config.getAge());
        return "hello,springboot";
    }

    public static void main(String[] args) {

        Class[] componets = new Class[]{SpringbootApplication.class, UserController.class};

        SpringApplication.run(componets, args);
    }
}
