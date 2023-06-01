package com.code.learnjava.dao;

import java.util.List;

import com.code.learnjava.entity.Employee;

// Que significa <Valor>
public interface EmployeeDAO {
    List<Employee> findAll();
}
