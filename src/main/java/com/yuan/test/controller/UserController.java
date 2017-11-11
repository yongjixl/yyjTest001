package com.yuan.test.controller;

import com.yuan.test.model.User;
import com.yuan.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/getUser")
    public String getUser(){
        String a = "aaa1";
        User aaa = userService.findUser(a);
        if(aaa == null){
            return "aaaaa is null";
        }
        return aaa.getPassWord();
    }
}
