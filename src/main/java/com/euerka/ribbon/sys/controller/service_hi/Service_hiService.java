package com.euerka.ribbon.sys.controller.service_hi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="SERVICE-HI",fallback = SchedualServiceHiHystric.class)
public interface Service_hiService {

    @GetMapping("/hi")
    String hi(@RequestParam("name") String name);

}
