package com.luv2code.restcruddemo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.restcruddemo.entity.Student;

import jakarta.annotation.PostConstruct;
import jakarta.servlet.annotation.HttpConstraint;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	private List<Student> students;
	
	@PostConstruct
	public void addData() {
		students = new ArrayList<>();
		students.add(new Student("Bhavesh", "Kumar"));
		students.add(new Student("Vinay", "Kumar"));
		students.add(new Student("Lalu", "Kumar"));
		students.add(new Student("Hitesh", "Kumar"));
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		return students;
	}
	
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		
		if(studentId >= students.size() || studentId<0)
			throw new  StudentNotFoundException("Student id not found -  "+studentId);
		return students.get(studentId);
	}
	
	

	
	

}
