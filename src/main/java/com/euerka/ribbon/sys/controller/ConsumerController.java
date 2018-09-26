package com.euerka.ribbon.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class ConsumerController {
    @Resource
    private ConsumerService consumerService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return  consumerService.hi(name);
    }

}
