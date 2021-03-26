package com.ludynia.employeeManagmentSystem.controller;


import com.ludynia.employeeManagmentSystem.model.Employee;
import com.ludynia.employeeManagmentSystem.service.EmployeeService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/")
    public String viewHomePage(Model model) {
    model.addAttribute("listOfEmployees",employeeService.getAllEmployees());
    return "index";
    }


}
