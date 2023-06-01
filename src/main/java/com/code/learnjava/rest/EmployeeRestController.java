package com.code.learnjava.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.learnjava.dao.EmployeeDAO;
import com.code.learnjava.entity.Employee;


@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeDAO employeeDAO;

    public EmployeeRestController(EmployeeDAO theEmpliEmployeeDAO) {
        employeeDAO = theEmpliEmployeeDAO;
    }

    @GetMapping("/employees")
    public List <Employee> findAll() {
        return employeeDAO.findAll();
    }
}
