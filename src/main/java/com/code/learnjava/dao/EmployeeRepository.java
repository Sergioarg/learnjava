package com.code.learnjava.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.learnjava.entity.Employee;

// JpaRepository<EntityType, PrimaryKey >
// @RepositoryRestResource(path = "members") Change path of API
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
    // This created all CRUD methods
}
