package com.dobby.movie_community.controller;


import com.dobby.movie_community.model.UserModel;
import com.dobby.movie_community.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping(path = "/auth")
public class AuthController {

    @Autowired
    private UserService userService;
    @PostMapping(value="/sign")
    @ResponseBody
    public String postMethodName(@RequestBody UserModel user) {

        System.out.println( user );
        int result = userService.authenticateUser(user);

        System.out.println( user );
        
        return result+"";
    }
    

}
