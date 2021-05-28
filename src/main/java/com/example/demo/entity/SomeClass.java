package com.example.demo.entity;

import java.util.HashMap;
import java.util.Map;

public class SomeClass {
    private Map<String, Float> accounts=new HashMap<>();

    public void setAccounts(Map<String, Float> accounts) {
        this.accounts = accounts;
    }
    public SomeClass(){

    }

    public Map<String, Float> getAccounts() {
        return accounts;
    }
}
