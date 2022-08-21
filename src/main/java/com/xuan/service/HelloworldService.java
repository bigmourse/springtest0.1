package com.xuan.service;


import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
//@EnableAutoConfiguration
@Slf4j
public class HelloworldService {

    @RequestMapping("/")
    public String helloWorld(){
        return "hello world ! ok";
    }
//    @RequestMapping("/test")
//    public String test(Map<Object,Object> map){
//        return null;
//    }

    @RequestMapping("/exception")
    public int exception(Integer number){
        int result=1/number;
        return result;
    }

    @RequestMapping("/logTest")
    public String logTest(String name,Integer age){
        log.info("name:{},age:{}",name,age);
        log.debug("debug");
        return name+age;

    }
//    public static void main(String[] args) {
//        SpringApplication.run(HelloworldService.class, args);
//    }


}
