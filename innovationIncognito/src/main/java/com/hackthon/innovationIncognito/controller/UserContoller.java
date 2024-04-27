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
    public boolean b=false;
    public User userLogin;

@Autowired
    UserRepositary userRepositary;
@GetMapping("/Login")
    public String Login()
{
    return"Login";
}
@GetMapping("/Signup")
    public String Signup()
{
    return"Signup";

}
@PostMapping("/proces")
    @ResponseBody
    public String fromValidation(@ModelAttribute("User") User user , Model model){
    String email=user.getEmail();
    String password=user.getPassword();
    User userValid= userRepositary.getUserByEmailAndPassword(email,password);
    if(userValid== null)
    {
        return "Login";

    }
    userLogin=userValid;
model.addAttribute("user",userLogin);
b=true;
return"Home";
}
@PostMapping("/profile")
        @ResponseBody
    public String UserProfile(Model model)
{
    if(b==false){
        return"Login";
    }
    model.addAttribute("user",userLogin);
    return"ProfileView";
}
@GetMapping("/logout")
    public String Logout()
{
    b=false;
  userLogin=null;
    return"Login";
}
@PostMapping("/updateProfile")
    @ResponseBody
    public String UpdateProfile(@ModelAttribute("User") User user, Model model) {
    if (b == false) {
        return "Login";
    }
    return "home";
}
}
