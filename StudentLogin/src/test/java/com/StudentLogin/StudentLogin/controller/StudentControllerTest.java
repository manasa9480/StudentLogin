package com.StudentLogin.StudentLogin.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.StudentLogin.StudentLogin.Service.StudentService;
import com.StudentLogin.StudentLogin.entity.Student;


@ExtendWith(MockitoExtension.class)

class StudentControllerTest {
	
	@InjectMocks 
	
	StudentController studentController;
	@Mock
	private StudentService studentService;
	
	@Mock
	Student student;
	
	@Test
	void testGetAllStudents() {
		studentController.getAllStudents();
	}

	@Test
	void testCreateStudent() {
	
		studentController.createStudent(null);
	}

	@Test
	void testUpdateStudent() {
		student.setName("bcc");
		studentController.updateStudent("cdd",student);
		
	}

	@Test
	void testDeleteStudent() {
		studentController.deleteStudent("abc");
		
	}

}
