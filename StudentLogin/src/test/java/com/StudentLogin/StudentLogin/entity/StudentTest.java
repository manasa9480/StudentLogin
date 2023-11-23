package com.StudentLogin.StudentLogin.entity;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;




@ExtendWith(MockitoExtension.class)

class StudentTest {
	@InjectMocks 
	 Student student;
	@Test
	
	void testGetName() {
	student.getName();
	
	}

	@Test
	void testSetName() {
		
		student.setName(null);
		
	}

	@Test
	void testGetAge() {
		student.getAge();
	}

	@Test
	void testSetAge() {
		student.setAge(44);
	}

	@Test
	void testGetSalary() {
		student.getSalary();	}

	@Test
	void testSetSalary() {
		student.setSalary(1000);
	}

	@Test
	void testGetId() {
		student.getId();
	}

	@Test
	void testSetId() {
		student.setId(1L);
	}

	

}
