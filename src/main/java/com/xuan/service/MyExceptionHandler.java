package com.xuan.service;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

//增强型controller注解 全局异常处理 结合注解 @ExceptionHandler 使用
@ControllerAdvice
public class MyExceptionHandler {
    //此类型错误全部拦截
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody//返回JSON格式
    public HashMap<Object, Object> exceptionHandler(){
        HashMap<Object,Object> hashMap=new HashMap<>();
        hashMap.put("code",500);
        hashMap.put("msg","系统错误");
        return hashMap;
    }
}
