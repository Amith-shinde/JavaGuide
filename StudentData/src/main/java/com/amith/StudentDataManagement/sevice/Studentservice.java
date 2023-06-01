package com.amith.StudentDataManagement.sevice;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amith.StudentDataManagement.entity.Student;
import com.amith.StudentDataManagement.repository.StudentDao;




@Service
public class Studentservice {
       @Autowired    
  	  private StudentDao studentDao;
       
        public Student saveStudent(Student student) 
        {
        	return studentDao.saveStudent(student);
        }
        public Student updateStudent(Student student) 
        {
        	return studentDao.update(student);
        }
        public List<Student> getAllStudent(Student student) 
        {
        	return studentDao.getAllStudent(student);
        }
}
