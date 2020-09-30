package com.consumer.controller;

import com.api.HelloDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DubboController {
    @Autowired
    HelloDubboService dubboService;

    @RequestMapping("dubboT")
    public String dubboT(String name){
        return dubboService.helloDubbo(name);
    }

}
