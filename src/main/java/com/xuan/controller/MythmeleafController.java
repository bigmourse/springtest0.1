//package com.xuan.controller;
//
//
//import com.xuan.entity.UserEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import javax.servlet.http.HttpServletRequest;
//import java.util.ArrayList;
//import java.util.Map;
//
//@Controller
//public class MythmeleafController {
//    @RequestMapping("/myThymeleaf")
//    public String mythymeleaf(HttpServletRequest httpServletRequest, Map<String,Object> result){
////        httpServletRequest.setAttribute("user",new UserEntity("xuanran",25));
//        result.put("user",new UserEntity("xuanran",25));
//        ArrayList<UserEntity> arrayList=new ArrayList<>();
//        arrayList.add(new UserEntity("xuanran001",001));
//        arrayList.add(new UserEntity("xuanran002",002));
//        arrayList.add(new UserEntity("xuanran003",003));
//        result.put("userList",arrayList);
//        return "myThymeleafHtml";
//    }
//}
