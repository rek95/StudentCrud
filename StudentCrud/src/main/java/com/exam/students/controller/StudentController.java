package com.exam.students.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exam.students.entity.Student;
import com.exam.students.service.StudentServiceImpInterface;

import lombok.Delegate;

@RestController
public class StudentController {

		@Autowired
        private	StudentServiceImpInterface impInterface;
	
		@PostMapping("/student")
		public Student saveStudent(@RequestBody Student student) {
			
			return  impInterface.saveStudent(student);
		}
		
	
		@GetMapping("/student")
		public List<Student> getStudentList(){
			
			return impInterface.getStudentList();
		}
	
		
		@GetMapping("/student/{id}")
		public Student getStudentById(@PathVariable("id") Integer id  ) {
			
			return impInterface.getStudentById(id);
		}
		
		
		@DeleteMapping("/student/{id}")
		public String deleteStudentById(@PathVariable("id") Integer id  ) {
			
			 impInterface.deleteStudentById(id);
			return "Student deleted having id "+id;
		}
		
		
		@PutMapping("/student/{id}")
		public Student updateStudent(@PathVariable("id") Integer id, @RequestBody Student student) {
			return  impInterface.updateStudent(id,student);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
