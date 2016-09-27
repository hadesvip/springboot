package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 如果不采用@SpringBootApplication注解，可以使用 @Configuration, @EnableAutoConfiguration and @ComponentScan
 * 因为他们是等同的。
 */
@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootApplication.class, args);
    }
}
