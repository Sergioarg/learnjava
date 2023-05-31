package com.code.learnjava.dao;

import java.util.List;

import com.code.learnjava.entity.Student;
// Data Access Object -> DAO
// ? Define the StudentDAO interface
public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByLastName(String theLastName);

    void update(Student theStudent);
}
