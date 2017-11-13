package com.yuan.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/page")
public class PageController {

    @RequestMapping("/login")
    public String login(){
        return "login.jsp";
    }

    @RequestMapping("/regist")
    public String regist(){
        return "regist.jsp";
    }
}
