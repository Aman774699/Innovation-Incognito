package com.hackthon.innovationIncognito.controller;

import com.hackthon.innovationIncognito.entity.Admin;
import com.hackthon.innovationIncognito.entity.User;
import com.hackthon.innovationIncognito.otpvalidation.Customvalidation;
import com.hackthon.innovationIncognito.repository.UserRepositary;
import com.hackthon.innovationIncognito.securityconfigure.MyConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserContoller {
    @Autowired
    private UserRepositary userRepositary;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

//    LOGIN
    @GetMapping("/login")
    public String Login() {

        return "Login";
    }

//    INDEX WITHOUT LOGIN
    @GetMapping("/index")
    public String index() {
        return "index";
    }

//    NEW  USER REGISTRATION
    @PostMapping("/Signup")
    public String Signup(@ModelAttribute("user") User user) {
        if (user == null) {
            throw new BadCredentialsException("Bad credentials");
        }
        else
        {
           user.setPassword(passwordEncoder.encode(user.getPassword()));
        }
        userRepositary.save(user);
        return "Login";
    }

//    LOGOUT USER
    @GetMapping("/logout")
    public String Logout() {
        return "Login";
    }
}
