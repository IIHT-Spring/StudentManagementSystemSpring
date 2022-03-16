package com.student.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.student.entity.StudentEntity;

@ExtendWith(MockitoExtension.class)
public class StudentServiceImplTest {
	
	@InjectMocks
	StudentServiceImpl service; // dependent
	
	@Mock
	IStudentRepository repository; // dependency 
	
	@Test
	void testNewStudent() {
	StudentEntity student = new StudentEntity();
	student.setId(1);
	when(repository.save(student)).thenReturn(student);
	service.saveStudent(student);
	assertEquals(1, student.getId());
	}

}
