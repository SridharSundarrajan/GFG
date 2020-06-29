package com.example.dbauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/admin")
    public String getAdmin(){
        return "hello Admin";
    }

    @GetMapping("/student")
    public String getStudent(){
        return "Hello Student";
    }

    @GetMapping("/admin/security")
    public String getSecurity(){
        return "Hello Security";
    }

    @GetMapping("/visitor")
    public String getVisitor(){
        return "hello Visitor";
    }
}
