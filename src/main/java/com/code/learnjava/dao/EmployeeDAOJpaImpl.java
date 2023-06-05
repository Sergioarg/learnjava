package com.code.learnjava.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.code.learnjava.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository // ? Que hace repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

    // Define entityManager
    private EntityManager entityManager;

    // Set up contructor injection
    @Autowired
    public EmployeeDAOJpaImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public List<Employee> findAll() {
        // Create query
        TypedQuery<Employee> theQuery = entityManager.createQuery(
            "FROM Employee", Employee.class);
        // Execute query
        List<Employee> employees = theQuery.getResultList();
        return employees;
    }


    // CRUD Process

    @Override
    public Employee finEmployee(int theId) {
        Employee theEmployee = entityManager.find(Employee.class, theId);
        return theEmployee;
    }

    @Override
    // @Transactional Ahora el @Service ser encarga de los @Transactional
    public Employee save(Employee theEmployee) {
        Employee dbEmployee = entityManager.merge(theEmployee);
        return dbEmployee;
    }

    @Override
    public void deleteById(int theId) {
        Employee theEmployee = entityManager.find(Employee.class, theId);
        entityManager.remove(theEmployee);
    }

}
