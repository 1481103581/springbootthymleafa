package com.nala.controller;

import com.nala.pojo.User;
import com.nala.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/getUserAll")
    public String getUserAll(Model model){
        List<User> userAll = userService.getUserAll();
        model.addAttribute("user",userAll);
        return "userList";
    }

    @RequestMapping("/getIndex")
    public String getIndex(){
        return "index";
    }

    @RequestMapping("/getUserById")
    public String getUserById(Integer id, Model model){
        return "user";
    }
}
