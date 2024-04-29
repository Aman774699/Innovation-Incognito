package com.hackthon.innovationIncognito.controller;

import com.hackthon.innovationIncognito.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Module")
public class Modulecontroller extends UserContoller {


    @GetMapping("/computer_Courses")
    public String ComputerCourses(Model model) {
        if (super.userLogin == null) {
            return "Login";
        }
        return "subjects/computer_courses";
    }

    @GetMapping("/gate")
    public String Gateway() {
        if (super.userLogin == null) {
            return "Login";
        }

        return "/subjects/gate";
    }

    @GetMapping("/jee")
    public String Maths() {
        if (super.userLogin == null) {
            return "Login";
        }

        return "/subjects/jee";
    }

    @GetMapping("/quiz")
    public String Quiz() {
        if (super.userLogin == null) {
            return "Login";
        }
        return "/subjects/quiz";
    }

//    @GetMapping("/datastructure")
//    public String DataStructure() {
//        if (super.userLogin == null) {
//            return "Login";
//        }
//        return "/subjects/datastructure";
//    }
    @GetMapping("/datastructure")
    public String DataStructure() {
        if (super.userLogin == null) {
            return "Login";
        }
        return "/subjects/datastructure";
    }



    @GetMapping("/algorithms")
    public String algorithm() {
        if (super.userLogin == null) {
            return "Login";
        }
        return "/subjects/algorithms";
    }


}



