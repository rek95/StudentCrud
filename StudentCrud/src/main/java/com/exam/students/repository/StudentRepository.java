package com.exam.students.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.students.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
