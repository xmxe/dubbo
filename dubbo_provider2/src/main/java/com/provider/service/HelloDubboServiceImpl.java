package com.provider.service;

import com.api.HelloDubboService;


public class HelloDubboServiceImpl implements HelloDubboService{
    @Override
    public String helloDubbo(String name) {
        return "这是provider2提供的:" + name;
    }
}
