package com.ludynia.employeeManagmentSystem.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class EmployeeController {



    public String hello(){
        return "index";
    }


}
