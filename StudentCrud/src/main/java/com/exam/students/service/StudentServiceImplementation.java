package com.exam.students.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.students.entity.Student;
import com.exam.students.repository.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentServiceImpInterface{

	@Autowired
	private StudentRepository repository;
	
	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return repository.save(student);
	}
	
	
	@Override
	public List<Student> getStudentList() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	
	
	@Override
	public Student getStudentById(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}
	
	
@Override
	public void deleteStudentById(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

@Override
public Student updateStudent(Integer id, Student student) {
	// TODO Auto-generated method stub
	Student getStudent=repository.findById(id).get();
	
	
	
	return repository.save(getStudent);
}



}
