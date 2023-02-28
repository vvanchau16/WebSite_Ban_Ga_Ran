package com.example.BANGAAPI.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/api" )
public class HomeController {
    @GetMapping("/home")
    public String HomePage (){
        return "index";
    }

    @GetMapping("/dangky")
    public  String DangKy(){
        return "dangki";
    }
}
