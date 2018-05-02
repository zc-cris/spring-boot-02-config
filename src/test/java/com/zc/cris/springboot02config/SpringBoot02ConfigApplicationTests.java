package com.zc.cris.springboot02config;

import com.zc.cris.springboot02config.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    // slf4j 的日志记录器
    Logger logger = LoggerFactory.getLogger(getClass());



    @Test
    public void test() {
        boolean b = ioc.containsBean("helloService");
        System.out.println(b);  // true
    }

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

    @Test
    public void testSLF4j() {

        // 日志级别由低到高：trace<debug<info<warn<error
        logger.trace("这是trace级别的日志");
        logger.debug("这是debug级别的日志");
        // springBoot 默认打印info及以上级别的日志信息：默认的root级别规则
        // 可以在配置文件中自定义设置日志级别
        logger.info("这是info级别的日志");
        logger.warn("这是warn级别的日志");
        logger.error("这是error级别的日志");

    }

}
