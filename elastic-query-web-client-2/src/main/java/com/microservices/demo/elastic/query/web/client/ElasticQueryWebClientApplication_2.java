package com.microservices.demo.elastic.query.web.client;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.microservices.demo")
public class ElasticQueryWebClientApplication_2 {
    public static void main(String[] args) {
        SpringApplication.run(ElasticQueryWebClientApplication_2.class, args);
    }
}
