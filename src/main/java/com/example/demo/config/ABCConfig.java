package com.example.demo.config;

import com.example.demo.entity.BeanA;
import com.example.demo.entity.BeanB;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.*;

@Configuration
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class ABCConfig {

    @Bean
    @Lazy(value = true)
//    @DependsOn
//    @Scope("singleton")
    public BeanA beanA(){
        String asd = null;//LAZY影響
        asd.equals(""); //LAZY影響
        System.out.println("被創了");
        return new BeanA("qpr");
    }

    @Bean
    public BeanB beanB() {
        return new BeanB();
    }
}
