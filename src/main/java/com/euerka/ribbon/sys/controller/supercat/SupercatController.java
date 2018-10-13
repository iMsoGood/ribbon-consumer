package com.euerka.ribbon.sys.controller.supercat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class SupercatController {
    @Resource
    private SupercatService supercatService;

    @GetMapping(value = "/login")
    public ModelAndView login(){
        return supercatService.login();
    }
}
