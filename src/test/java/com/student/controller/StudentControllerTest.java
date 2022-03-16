package com.student.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.student.entity.StudentEntity;
import com.student.service.IStudentService;

@ExtendWith(MockitoExtension.class)
public class StudentControllerTest {
	@InjectMocks
	StudentController controller; // dependent
	@Mock
	IStudentService service; // dependency 
	
	@Test
	void testSaveStudent() { // test case 
		StudentEntity student = new StudentEntity();
		student.setId(1);
		when(service.saveStudent(student)).thenReturn(1);
		int id = controller.createStudent(student);
		assertEquals(1, id);
		
	}
	// write a test case to test the get student service method in the controller 
	
	

}
