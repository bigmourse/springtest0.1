//package com.xuan.service;
//
//import com.xuan.memberMapper.MemberMapper;
//import com.xuan.orderMapper.OrderMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class MulSourceService {
//    @Autowired
//    private MemberMapper memberMapper;
//    @RequestMapping("/insertMember")
//    public String insertMember(String name,Integer age){
//        int result=memberMapper.addUser(name, age);
//        return result>0?"success":"fail";
//    }
//    @Autowired
//    private OrderMapper orderMapper;
//    @RequestMapping("/insertOrder")
//    public String insertOrder(String number){
//        int result=orderMapper.insertOrder(number);
//        return result>0?"success":"defeat";
//    }
//
//}
