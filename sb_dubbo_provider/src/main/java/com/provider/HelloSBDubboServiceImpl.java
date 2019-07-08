package com.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.api.HelloDubboService;

@Service(interfaceClass = HelloDubboService.class,version = "${demo.service.version}")  //alibaba的service注解，否则不会发布成功 如果发布的接口需要加入版本号:@Service(version="1.0")
public class HelloSBDubboServiceImpl  implements HelloDubboService {
    @Override
    public String helloDubbo(String name) {
        return "这是springboot+dubbo提供的:"+name;
    }
}
