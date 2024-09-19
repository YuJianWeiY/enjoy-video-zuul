package com.enjoy.video;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableZuulProxy
public class EnjoyVideoZuulApp {

    public static void main(String[] args){
        ApplicationContext app = SpringApplication.run(EnjoyVideoZuulApp.class, args);
    }

}
