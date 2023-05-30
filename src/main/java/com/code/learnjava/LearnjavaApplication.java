package com.code.learnjava;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

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
			// createReadStudent(studentDAO);
			searchStudent(studentDAO);
			// createMultipleStundens(studentDAO);
		};
	}

	private void searchStudent(StudentDAO studentDAO) {

		// Display id of the saved student
		Student myStudent = studentDAO.findById(1);
		System.out.println("Found the student: " + myStudent);
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

	// ? Method to Student at the moment of running the project
	private void createReadStudent(StudentDAO studentDAO) {
		// Create the student object
		System.out.println("Creating new student object...");
		Student tempStudent = new Student("Test", "Ramos", "sergio@gmail.com");

		// Save the student object
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);
	}
}
