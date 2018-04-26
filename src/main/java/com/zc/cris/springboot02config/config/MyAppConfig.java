package com.zc.cris.springboot02config.config;

import com.zc.cris.springboot02config.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 告诉spring boot 这是一个配置类
@Configuration
public class MyAppConfig {

    // 通过@Bean 注解来往spring boot容器中添加组件,默认方法名就是组件的id
    @Bean
    public HelloService helloService(){
        System.out.println("自定义的配置类给容器中添加自定义组件了");
        return new HelloService();
    }
}
