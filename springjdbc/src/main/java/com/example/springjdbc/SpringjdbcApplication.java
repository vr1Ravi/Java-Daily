package com.example.springjdbc;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.springjdbc.model.Student;
import com.example.springjdbc.service.StudentService;

@SpringBootApplication
public class SpringjdbcApplication {

	public static void main(String[] args) {
	ApplicationContext context = SpringApplication.run(SpringjdbcApplication.class, args);

     	Student st1 = context.getBean(Student.class);
		st1.setName("Skinny pete");
		st1.setMarks(10);
		st1.setRollNo(4);
		
		StudentService service = context.getBean(StudentService.class);
		service.addStudent(st1);

		List<Student> students = service.getAllStudents();
		System.err.println(students);
	}

}
