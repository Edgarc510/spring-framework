package com.project.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("/user")//this is endpoint of URL on browser
    public String user(){
        return "/user/userinfo.html";  // go to folder static and look here
    }



}
