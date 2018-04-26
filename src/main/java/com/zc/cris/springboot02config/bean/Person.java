package com.zc.cris.springboot02config.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;


/**
 * 将yml 配置文件中的每一个属性的值，映射到这个组件中
 * @ConfigurationProperties：告诉springboot 将本类中的所有属性和配置文件中的相关配置绑定
 * prefix: 配置文件中的哪个下面的所有属性进行一一映射
 *
 * 只有这个组件是容器中的组件，才可以使用容器提供的ConfigurationProperties 功能
 * @ConfigurationProperties(prefix = "person") 默认从全局配置文件中获取值；实际开发中，和springboot 关系不大的组件的属性值可以
 * 从指定的配置文件中获取，防止全局配置文件
 *
 * @PropertySource 注解可以加载指定的配置文件
 */
@PropertySource(value = {"classpath:person.properties"})
@Component
@ConfigurationProperties(prefix = "person")
//@Validated
public class Person {

    /*
        <bean class="Person">
            <property name="name" value="字面量/${key}从环境变量，配置文件中获取值/#{SpEL}"></property>
        </bean>
        还是建议使用@ConfigurationProperties 注解
     */
    //@Value("${person.name}")
    //@Email @ConfigurationProperties 支持 JSR303 数据校验
    private String name;
    //@Value("#{12*2}")
    private Integer age;
    //@Value("false")
    private Boolean boss;
    private Date birth;

    private Dog dog;
    private Map<String, Object> map;
    private List<Object> list;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", dog=" + dog +
                ", map=" + map +
                ", list=" + list +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }
}
