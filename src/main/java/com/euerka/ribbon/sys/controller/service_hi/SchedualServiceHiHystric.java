package com.euerka.ribbon.sys.controller.service_hi;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements Service_hiService {

    @Override
    public String hi(String name) {
        return "sorry,"+name;
    }
}
