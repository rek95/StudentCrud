package com.exam.students.service;

import java.util.List;

import com.exam.students.entity.Student;

public interface StudentServiceImpInterface {

	Student saveStudent(Student student);

	List<Student> getStudentList();

	Student getStudentById(Integer id);

	void deleteStudentById(Integer id);

	Student updateStudent(Integer id, Student student);

}
