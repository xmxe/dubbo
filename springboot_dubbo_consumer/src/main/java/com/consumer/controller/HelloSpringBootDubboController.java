package com.consumer.controller;

import com.api.HelloDubboService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBootDubboController {
    @Reference(version = "${demo.service.version}")
    HelloDubboService hsbs;

    @RequestMapping("/sayHello/{name}")
    public String helloDubbo(@PathVariable("name") String name){
        return hsbs.helloDubbo(name);
    }
}
