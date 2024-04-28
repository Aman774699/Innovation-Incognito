package com.hackthon.innovationIncognito.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Test")
public class TestContoller {
    @GetMapping("/gate")
    public String gatetest()
    {
        return "index";
    }
}
