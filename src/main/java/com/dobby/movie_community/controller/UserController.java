package com.dobby.movie_community.controller;

import com.dobby.movie_community.model.User;
import com.dobby.movie_community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/new")
    public String createForm() {
        return "users/createUserForm";
    }

    @PostMapping("/users/new")
    public String create(UserForm form){
        User user = new User();
        user.setUser_id(form.getUser_id());
        user.setUser_password(form.getUser_password());
        user.setUser_gender(form.getUser_gender());
        user.setUser_name(form.getUser_name());
        user.setUser_email(form.getUser_email());
        user.setUser_address(form.getUser_address());
        user.setUser_birth(form.getUser_birth());
        user.setUser_phone(form.getUser_phone());

        userService.join(user);
        return "redirect:/";
    }

    @GetMapping("/users")
    public String list(Model model){
        List<User> users = userService.findUsers();

        model.addAttribute("users", users);
        return "users/userList";
    }
}
