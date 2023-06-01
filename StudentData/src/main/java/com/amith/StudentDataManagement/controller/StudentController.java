package com.amith.StudentDataManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amith.StudentDataManagement.entity.Student;
import com.amith.StudentDataManagement.sevice.Studentservice;

@RestController
public class StudentController {
    @Autowired
	 private Studentservice studentService;
    
	 @PostMapping("students")
	 public Student saveStudentData(@RequestBody Student student) 
	 {
		 return studentService.saveStudent(student);
	 }
	 @PutMapping("/students")
	 public Student updateStudentData(@RequestBody Student student) 
	 {
		 return studentService.saveStudent(student);
	 }
	 @GetMapping("/students")
	 public List<Student> getAllStudent(Student student)
	 {
		 return studentService.getAllStudent(student);
	 }
}
