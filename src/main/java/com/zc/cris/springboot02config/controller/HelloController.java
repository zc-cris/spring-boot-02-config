package com.zc.cris.springboot02config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // 在某个组件中只需要获取一下配置文件中的某个简单类型的值，使用@Value
    @Value("${person.name}")
    private String name;

    @RequestMapping("/hello")
    public String hello(){
        return "hello:" + name;
    }

}
