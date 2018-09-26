package com.euerka.ribbon.sys.controller;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements ConsumerService{

    @Override
    public String hi(String name) {
        return "sorry,"+name;
    }
}
