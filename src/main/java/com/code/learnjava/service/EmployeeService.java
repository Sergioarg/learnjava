package com.code.learnjava.service;

import java.util.List;

import com.code.learnjava.entity.Employee;

public interface EmployeeService {

    List<Employee> findAll();

    // Read
    Employee findById(int theId);

    // Create
    Employee save(Employee theEmployee);

    // Delete
    void deleteById(int theId);
}
