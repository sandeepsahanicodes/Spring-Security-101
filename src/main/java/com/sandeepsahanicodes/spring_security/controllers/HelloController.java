package com.sandeepsahanicodes.spring_security.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
   @GetMapping("hello")
    public String greet() {
        return "Hello World";
    }

    @GetMapping("about")
    public String about() {
       return "Sandeep is a Software Developer";
    }
}
