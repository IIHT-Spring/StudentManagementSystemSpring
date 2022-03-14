package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.StudentEntity;
import com.student.service.IStudentService;

@RestController
public class StudentController {
	@Autowired
	IStudentService studentService;
	
	
	@PostMapping("/student")
	Integer createStudent(@RequestBody StudentEntity student) {
		Integer id = studentService.saveStudent(student);
		System.out.println(id);
		return id;
		
	}
	

}
