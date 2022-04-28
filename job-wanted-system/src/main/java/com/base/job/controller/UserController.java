package com.base.job.controller;

import com.base.job.model.User;
import com.base.job.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("login")
    public String selectUserByUsernameAndPassword(String userName, String passWord){
        User user = userService.selectUserByUsernameAndPassword(userName,passWord);
        if (user == null ){
            return "index";
        }
        return "main-page";
    }

    @RequestMapping("/openUser")
    public String openUser(){
        return "user";
    }

    @GetMapping("/openAddUser")
    public String openAddUser(){
        return "adduser";
    }

    @GetMapping("/openUpdateUser")
    public String openUpdateUser(){
        return "updateuser";
    }

    @GetMapping("/openDeleteUser")
    public String openDeleteUser(){
        return "";
    }


}
