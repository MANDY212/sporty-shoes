package com.sportyshoes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sportyshoes.model.User;
import com.sportyshoes.repositories.UserRepository;

@RestController
public class UserController {
    @Autowired
    UserRepository urepo;

    @RequestMapping("/user")
    @ResponseBody
    public String user() {
        return " Welcome to Sport Shoes ";
    }

    @PostMapping("/user/signup")
    public User addUser(User user) {
        urepo.save(user);
        return user;
    }
}
