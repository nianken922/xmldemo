package com.example.demo.entity;

import java.util.HashMap;
import java.util.Map;
/*
        實例工廠方式
 */
public class CarInstanceFactory {
    private Map<Integer, Car> map = new HashMap<>();

    public void setMap(Map<Integer, Car> map) {
        this.map = map;
    }

    public CarInstanceFactory(){
    }

    public Car getCar(int id){
        return map.get(id);
    }


}
