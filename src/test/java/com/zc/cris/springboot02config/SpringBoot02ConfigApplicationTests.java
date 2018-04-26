package com.zc.cris.springboot02config;

import com.zc.cris.springboot02config.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * springboot 的单元测试
 * 可以在测试期间，很方便的类似编码一样使用自动注入等容器功能
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot02ConfigApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void test(){
        boolean b = ioc.containsBean("helloService");
        System.out.println(b);  // true
    }

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
