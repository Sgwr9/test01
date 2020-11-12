package com.ly.core.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @RequestMapping(value = "/login.action")
    public String toLogin(){
        System.out.println("hqhqhq");
        return "login";
    }
}
