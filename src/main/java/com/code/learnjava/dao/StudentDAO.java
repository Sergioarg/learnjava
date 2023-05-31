package com.code.learnjava.dao;

import java.util.List;

import com.code.learnjava.entity.Student;
// Data Access Object -> DAO
// ? Define the StudentDAO interface
public interface StudentDAO {

    // C: Create
    void save(Student theStudent);
    // R: Read
    Student findById(Integer id);
    List<Student> findAll();
    List<Student> findByLastName(String theLastName);
    // U: Update
    void update(Student theStudent);
    // D: Delete
    void delete(Integer id);
    int deleteAll();
}
