package com.provider;

import com.api.HelloDubboService;
import org.apache.dubbo.config.annotation.Service;

@Service(interfaceClass = HelloDubboService.class,version = "${demo.service.version}")
public class HelloSpringBootDubboServiceImpl implements HelloDubboService {
    @Override
    public String helloDubbo(String name) {
        return "这是springboot+dubbo提供的:"+name;
    }
}
