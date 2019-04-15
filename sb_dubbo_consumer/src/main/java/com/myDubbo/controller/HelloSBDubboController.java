package com.myDubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.myDubbo.service.HelloDubboService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSBDubboController {
    @Reference(version = "${demo.service.version}")
    HelloDubboService hsbs;

    @RequestMapping("/sayHello/{name}")
    public String helloDubbo(@PathVariable("name") String name){
        return hsbs.helloDubbo(name);
    }
}
