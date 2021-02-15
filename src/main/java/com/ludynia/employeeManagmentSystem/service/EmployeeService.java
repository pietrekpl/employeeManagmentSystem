package com.ludynia.employeeManagmentSystem.service;

import com.ludynia.employeeManagmentSystem.model.Employee;
import com.ludynia.employeeManagmentSystem.repository.EmployeeRepository;

import java.util.List;

public class EmployeeService {

   private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> findAll(){
      return employeeRepository.findAll();
    }





}
