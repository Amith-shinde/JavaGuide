package com.amith.StudentDataManagement.repository;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amith.StudentDataManagement.entity.Student;


@Repository
public class StudentDao {
 
	 @Autowired
	 private StudentRepository studentRepository;
	 
	  public Student saveStudent(Student student) 
	  {
		  return studentRepository.save(student);
	  }
	  
	  public Student update(Student student) 
	  {
		  return studentRepository.save(student);
	  }
	  public List<Student> getAllStudent(Student student)
	  {
		  return studentRepository.findAll();
	  }
}
