package com.neosoft.app.main.studentjwt.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class StudentDto {
	private String username;
	private String password;
	private int student_id ;
	private String first_name;
	private String last_name;
	private String mobileNumber;
	private String email ;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Project> project;
}
