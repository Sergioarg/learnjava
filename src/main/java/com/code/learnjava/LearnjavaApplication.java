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
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		// Create the student object
		System.out.println("Creating new student object...");
		Student tempStudent = new Student("Sergio", "Ramos", "sergio@gamil.com");

		// Save the student object
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);

		// Display id of the saved student
		System.out.println("Saved student.  Generated id: " + tempStudent.getId());
	}
}
