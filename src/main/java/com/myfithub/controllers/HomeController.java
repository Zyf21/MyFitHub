package com.myfithub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {

 //   @Autowired
   // private InMemoryUserDetailsManager userManager;

    @GetMapping("/login")
    public String greeting() {
        return "Authentication Example";
    }

}
