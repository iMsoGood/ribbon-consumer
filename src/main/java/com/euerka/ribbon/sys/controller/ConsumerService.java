package com.euerka.ribbon.sys.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="SERVICE-HI",fallback = SchedualServiceHiHystric.class)
public interface ConsumerService {



}
