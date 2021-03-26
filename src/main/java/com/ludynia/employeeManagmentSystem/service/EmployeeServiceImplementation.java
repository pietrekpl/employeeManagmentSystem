package com.ludynia.employeeManagmentSystem.service;


import com.ludynia.employeeManagmentSystem.model.Employee;
import com.ludynia.employeeManagmentSystem.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class EmployeeServiceImplementation implements EmployeeService{

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImplementation(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
