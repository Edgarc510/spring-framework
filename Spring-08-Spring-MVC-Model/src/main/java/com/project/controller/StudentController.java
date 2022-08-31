package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name","My Project");
        model.addAttribute("course","MVC");

        return "/student/welcome";
    }

    @RequestMapping("/edgar")
    public String homePage2(Model model){

        model.addAttribute("name","My Project");
        model.addAttribute("course","MVC");

        return "/student/welcome";
    }
}
