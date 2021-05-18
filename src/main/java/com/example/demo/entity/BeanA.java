package com.example.demo.entity;

public class BeanA {
    private  String name;

    public BeanA(String name) {
        System.out.println("被創了qqqq");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
