package com.myDubbo.service;

import com.alibaba.dubbo.config.annotation.Service;

@Service(interfaceClass = HelloDubboService.class,version = "${demo.service.version}")  //alibaba的service注解，否则不会发布成功 如果发布的接口需要加入版本号:@Service(version="1.0")
public class HelloSBDubboServiceImpl  implements HelloDubboService {
    @Override
    public String helloDubbo(String name) {
        return "springboot+dubbo:"+name;
    }
}
