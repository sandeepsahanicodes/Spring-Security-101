package com.sandeepsahanicodes.spring_security.controllers;

import com.sandeepsahanicodes.spring_security.model.User;
import com.sandeepsahanicodes.spring_security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("register")
    public User resister(@RequestBody  User user) {
        return service.saveUser(user);
    }
}
