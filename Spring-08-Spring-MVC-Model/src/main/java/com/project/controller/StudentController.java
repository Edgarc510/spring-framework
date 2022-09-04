package com.project.controller;

import com.project.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
        String subject = "Collection";
        model.addAttribute("subject",subject);

        int studentID = new Random().nextInt();
        model.addAttribute("id",studentID);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(3);
        numbers.add(6);
        numbers.add(7);
        model.addAttribute("numbers",numbers);

        Student student = new Student(1,"Edgar","James");
        model.addAttribute("student",student);




        return "/student/welcome";
    }
}
