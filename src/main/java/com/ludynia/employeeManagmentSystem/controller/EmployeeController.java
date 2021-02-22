package com.ludynia.employeeManagmentSystem.controller;


import com.ludynia.employeeManagmentSystem.model.Employee;
import com.ludynia.employeeManagmentSystem.service.EmployeeService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class EmployeeController {


    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public String hello(){
        return "index";
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> list = employeeService.findAll();
        return new ResponseEntity<List<Employee>>(list,new HttpHeaders(), HttpStatus.OK);
    }


}
