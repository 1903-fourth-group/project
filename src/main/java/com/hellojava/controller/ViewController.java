package com.hellojava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    @RequestMapping(value = "/login.com")
    public String loadView(){
        return "login";
    }
}
