package com.xuan.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix="xuan")
public class MyUserEntity {
//    @Value("${xuan.name}")
    private String name;
//    @Value("${xuan.age}")
    private Integer age;
//    @Value("${xuan.address}")
    private String address;

    @Override
    public String toString() {
        return "MyUserEntity{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
