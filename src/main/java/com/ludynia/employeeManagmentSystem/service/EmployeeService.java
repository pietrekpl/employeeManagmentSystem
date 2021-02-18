package com.ludynia.employeeManagmentSystem.service;

import com.ludynia.employeeManagmentSystem.model.Employee;
import com.ludynia.employeeManagmentSystem.repository.EmployeeRepository;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class EmployeeService {

   private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> findAll(){
      return employeeRepository.findAll();
    }


    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    public Optional<Employee> getEmployeeById(Long id) {

        Optional<Employee> employee = employeeRepository.findById(id);

        if (employee.isPresent()) {
           return employeeRepository.findById(id);
        } else {
            throw new UsernameNotFoundException("Employee not found");
        }

    }

    public void delete(Long id) {
        employeeRepository.deleteById(id);
    }



}

