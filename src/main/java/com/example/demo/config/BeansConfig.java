package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource
public class BeansConfig {

    public void init() {
        System.out.println("this is init method3");
    }
    public BeansConfig() {
        super();
        System.out.println("建構函式3");
    }
    public void destroy() {
        System.out.println("this is destroy method3");
    }
    public void test() {
        System.out.println("testttttttt");
    }

}
