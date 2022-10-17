package com.exam.students.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.longThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.exam.students.entity.Student;

@SpringBootTest
class StudentServiceImpInterfaceTest {

	@Autowired
	private  StudentServiceImpInterface impInterface;
	
	@Test
	public void saveTest() {
		/*
		 * Student student=Student.builder().studentFirstName("rekha")
		 * .studentLastName("Gaganmale") .emailAddress("rekha@gmail.com") .course("BE")
		 * .contact("8502456389") .build();
		 */
		
		Student student=Student.builder().studentFirstName("Tamma")
				.studentLastName("Shinde")
				.emailAddress("shinde@gmail.com")
				.course("BCS")
				.contact("9874561230")
				.build();
		
		
		
		
		//impInterface.saveStudent(student);
				
	}
	
	@Test
	public void getAllStudent() {
		List<Student> list=impInterface.getStudentList();
		System.out.println(list);
	}
	
	
	@Test
	public void getStudentById() {
		Student student=impInterface.getStudentById(2);
		System.out.println(student);
	}
	
	@Test
	public void updateStudent() {
		Student student=Student.builder().studentFirstName("Gundya")
				.studentLastName("Mane")
				.emailAddress("Mane@gmail.com")
				.course("IT")
				.contact("1230456789")
				.build();
		
		
		impInterface.updateStudent(1, student);
		
		getAllStudent();
	}
	
	@Test
	public void deleteStudent() {
		impInterface.deleteStudentById(2);
	}
	
	
	
	
	
	
	
	
}
