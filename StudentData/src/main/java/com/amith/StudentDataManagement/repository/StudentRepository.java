package com.amith.StudentDataManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amith.StudentDataManagement.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Integer> {

}
