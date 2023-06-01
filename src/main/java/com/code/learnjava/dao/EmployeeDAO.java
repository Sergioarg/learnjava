package com.code.learnjava.dao;

import java.util.List;

import com.code.learnjava.entity.Employee;

// Que significa <Valor>
public interface EmployeeDAO {
    List<Employee> findAll();

    // Read
    Employee finEmployee(int theId);

    // Create
    Employee save(Employee theEmployee);

    // Delete
    void deleteById(int theId);
}
