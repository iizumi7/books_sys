package com.crh.books_sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.websocket.server.PathParam;

@Controller
public class CommonController {

    @RequestMapping("/")
    public  String index(){
        return "index.html";
    }

    @RequestMapping("toPage/{pageName}")
    public String toPage(@PathVariable String pageName){
        return pageName+".html";
    }

/*    @RequestMapping("register")
    public String register(){
        return "register.html";
    }

    @RequestMapping("login")
    public String login(){
        return "login.html";
    }*/

}
