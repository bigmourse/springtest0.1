package com.xuan.service;

import com.xuan.entity.MyUserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyUserEntityService {
    @Autowired
    private MyUserEntity myUserEntity;

    @RequestMapping("/getMyUserEntity")
    public String getMyUserEntity(){
        return myUserEntity.toString();
    }
}
