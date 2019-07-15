package com.hellojava.controller;

import com.hellojava.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
public class UserController {
    @RequestMapping(value = "/loginHandler")
//    public String loginHandler(@RequestParam("userName") String uname, @RequestParam("userPwd") String upwd){
//        System.out.println(uname+"--"+upwd);
//        return "index";
//    }
    public String loginHandler(@Valid User user ,BindingResult result){
        if (result.hasErrors()){
            List<ObjectError> li = result.getAllErrors();
            for (int i = 0; i <li.size() ; i++) {
                System.out.println("error:"+li.get(i).getDefaultMessage());
            }
        }
        System.out.println(user);
        return "index";
    }
}
