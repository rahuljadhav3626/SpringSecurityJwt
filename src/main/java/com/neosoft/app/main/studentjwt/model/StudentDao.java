package com.neosoft.app.main.studentjwt.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="studentdao")
public class StudentDao {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int student_id ;
	private String username ;
	private String password ;
	private String first_name;
	private String last_name;
	private String mobileNumber;
	private String email ;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Project> project;
	
}
