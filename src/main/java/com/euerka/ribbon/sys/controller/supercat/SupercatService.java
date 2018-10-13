package com.euerka.ribbon.sys.controller.supercat;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@FeignClient(value="SUPER-CAT",fallback = SchedualSupercatHystric.class)
public interface SupercatService {
    @GetMapping("/login")
    ModelAndView login ();
}
