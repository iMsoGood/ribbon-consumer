package com.euerka.ribbon.sys.controller.service_hi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class Service_hiController {
    @Resource
    private Service_hiService servicehiService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam("name") String name) {
        return  servicehiService.hi(name);
    }

}
