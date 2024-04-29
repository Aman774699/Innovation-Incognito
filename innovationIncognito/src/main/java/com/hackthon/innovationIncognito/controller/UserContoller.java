package com.hackthon.innovationIncognito.controller;

import com.hackthon.innovationIncognito.entity.User;
import com.hackthon.innovationIncognito.repository.UserRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserContoller {
    public boolean b = false;
    public static User userLogin = null;


    @Autowired
    private UserRepositary userRepositary;

    @GetMapping("/login")
    public String Login() {

        return "Login";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @PostMapping("/Signup")
    public String Signup(@ModelAttribute("user") User user) {
        if (user == null) {
            System.out.println("The User is null");
        }
        userRepositary.save(user);
        return "Login";
    }

    @PostMapping("/proces")
    public String fromValidation(@ModelAttribute("User") User user, Model model) {
        String email = user.getEmail();
        String password = user.getPassword();
        User userValid = userRepositary.getUserByEmailAndPassword(email, password);
        if (userValid == null) {
            return "login";
        }
        userLogin = userValid;
        model.addAttribute("user", userLogin);
        b = true;
        return "index";
    }

   @GetMapping("/profile")
    public String UserProfile(Model model) {
        if (b == false) {
            return "login";
        }
        model.addAttribute("user", userLogin);
        return "ProfileView";
    }

    @GetMapping("/logout")
    public String Logout() {
        b = false;
        userLogin = null;
        return "Login";
    }

    @PostMapping("/updateProfile")
    @ResponseBody
    public String UpdateProfile(@ModelAttribute("User") User user, Model model) {
        if (!b ) {
            return "login";
        }
        return "home";
    }
}
