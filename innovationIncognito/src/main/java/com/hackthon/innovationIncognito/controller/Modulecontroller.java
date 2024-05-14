package com.hackthon.innovationIncognito.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Module")
public class Modulecontroller {


    @GetMapping("/computer_Courses")
    public String ComputerCourses(Model model) {
        return "/subjects/computer_Courses";
    }


    @GetMapping("/gate")
    public String Gateway() {
        return "/subjects/gate";
    }


    @GetMapping("/jee")
    public String Maths() {
        return "/subjects/jee";
    }


    @GetMapping("/quiz")
    public String Quiz() {
        return "/subjects/quiz";
    }


    @GetMapping("/datastructure")
    public String DataStructure() {
        return "/subjects/datastructure";
    }



    @GetMapping("/algorithms")
    public String algorithm() {
        return "/subjects/algorithms";
    }
}



