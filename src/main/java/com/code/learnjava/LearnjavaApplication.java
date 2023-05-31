package com.code.learnjava;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.code.learnjava.dao.StudentDAO;
import com.code.learnjava.entity.Student;

@SpringBootApplication
public class LearnjavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnjavaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			updateStudent(studentDAO);
		};
	}

	// ? Porque se pone primero StudentDAO studentDAO y luego
	private void updateStudent(StudentDAO studentDAO) {
		// Display id of the saved studet

		int studentId = 1;
		Student myStudent = studentDAO.findById(studentId);

		if (myStudent == null) {
			System.out.println("We can't find the student with id: " + studentId);
		} else {
			System.out.println("Student to student: " + myStudent);
			myStudent.setFirstName("Victoria");
			studentDAO.update(myStudent);
			System.out.println("Student updated: " + myStudent);
		}
	}

	private void createMultipleStundens(StudentDAO studentDAO) {

		System.out.println("Creating multiple students...");
		Student tempStudent1 = new Student("Paul", "Doe", "sergio@gamil.com");
		Student tempStudent2 = new Student("Jhon", "Doe", "jhon@gamil.com");
		Student tempStudent3 = new Student("Bala", "Doe", "bala@gamil.com");

		// Saving students objects
		System.out.println("Saving students...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
	}

	private void searchStudent(StudentDAO studentDAO) {

		// Display id of the saved student
		Student myStudent = studentDAO.findById(1);
		System.out.println("Found the student: " + myStudent);
	}

	private void queryForStudents(StudentDAO studentDAO) {

		List<Student> theStudents = studentDAO.findAll();
		for (Student tempStudent : theStudents) {
			System.out.println("Student: " + tempStudent);
		}
	}

	private void queryForStudentByLastName(StudentDAO studentDAO) {

		List<Student> theStudents = studentDAO.findByLastName("Doe");

		for (Student tempStudent : theStudents) {
			System.out.println("Student: " + tempStudent);
		}
	}
}
