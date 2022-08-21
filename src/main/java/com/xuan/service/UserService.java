package com.xuan.service;

import com.xuan.entity.UserEntity;
import com.xuan.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/insert")
    public String insertUser(String name,Integer age){
//        int result=jdbcTemplate.update("insert into users(name, age)  values(?,?);", name, age);
//        return result>0?"SUCCESS":"Fail";
        int update=jdbcTemplate.update("insert into users(name,age) values(?,?);", name, age);
        return update > 0 ? "sucess" : "false";
    }

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/mybatisFindById")
    public UserEntity mybatisFindById(Integer id){
        return userMapper.selectByUserId(id);
    }
    @RequestMapping("/mybatisInsert")
    public String mybatisInsert(String name,Integer age){
        int insert=userMapper.insertUser(name, age);
        return insert>0?"sucess":"false";
    }

}
