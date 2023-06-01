package com.amith.StudentDataManagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="Student_data")
public class Student {
      @Id
      @GeneratedValue(strategy = GenerationType.AUTO)
	  private Integer id;
	  private String name;
	  private String email;
	  private String address;
	  private long phoneNo;
}
