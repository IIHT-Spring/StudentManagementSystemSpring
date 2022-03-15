package com.student.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	
	@GetMapping("student/{id}")
	public Optional<StudentEntity> getStudent(@PathVariable Integer id) {
		Optional<StudentEntity> student = studentService.getStudent(id);
		return student;
	}
	
	@GetMapping("/allstudents")
	public List<StudentEntity> getStudent(){
		return studentService.getAllStudents();
	}
	
	@DeleteMapping("/student/{id}")
	public ResponseEntity<StudentEntity> deleteOrder(@PathVariable Integer id) {
		System.out.println(id);
		ResponseEntity<StudentEntity> responseEntity = new ResponseEntity<StudentEntity>(HttpStatus.OK);
				try {
					studentService.deleteStudent(id);
				}catch (Exception e) {
					e.printStackTrace();
					responseEntity = new ResponseEntity<StudentEntity>(HttpStatus.NOT_FOUND);
				}
		return responseEntity;
	}
	

	

}
