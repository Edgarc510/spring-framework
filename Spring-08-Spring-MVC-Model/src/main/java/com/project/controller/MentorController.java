package com.project.controller;

import com.project.enums.Gender;
import com.project.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/mentor")
public class MentorController {

    @RequestMapping("/mentor")
    public String showTable(Model model){

        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("Mike","Sams", 18,Gender.MALE));
        mentorList.add(new Mentor("Jones","Wells", 18,Gender.MALE));
        mentorList.add(new Mentor("Wendy","Ford", 18,Gender.FEMALE));

        model.addAttribute("mentors", mentorList);

        return "mentor/mentor";
    }

}
