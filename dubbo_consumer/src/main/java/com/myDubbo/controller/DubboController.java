package com.myDubbo.controller;

import com.myDubbo.service.HelloDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DubboController {
    @Autowired
    HelloDubboService dubboService;

    @RequestMapping("dubboT")
    public String dubboT(String name){
        //return name;
        return dubboService.helloDubbo(name);
    }

}
