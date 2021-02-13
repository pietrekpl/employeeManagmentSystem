package com.ludynia.employeeManagmentSystem.model;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;


@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotEmpty(message = "This field can't be empty")
    private String firstName;
    @NotEmpty(message = "This field can't be empty")
    private String lastName;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate workStartDate;

    public Employee() {
    }

    public Employee(Long id, @NotEmpty(message = "This field can't be empty") String firstName,
                    @NotEmpty(message = "This field can't be empty") String lastName,
                    LocalDate workStartDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.workStartDate = workStartDate;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getWorkStartDate() {
        return workStartDate;
    }

    public void setWorkStartDate(LocalDate workStartDate) {
        this.workStartDate = workStartDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", workStartDate=" + workStartDate +
                '}';
    }
}
