package com.neosoft.app.main.studentjwt.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.neosoft.app.main.studentjwt.model.Project;
import com.neosoft.app.main.studentjwt.model.StudentDao;
import com.neosoft.app.main.studentjwt.model.StudentDto;
import com.neosoft.app.main.studentjwt.repository.IStudentRepository;

@Service
public class JwtUserDetailsService implements UserDetailsService {
	
	@Autowired
	private IStudentRepository userDao;

	@Autowired
	private PasswordEncoder bcryptEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		StudentDao user = userDao.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
				new ArrayList<>());
	}
	
	public StudentDao save(StudentDao user) {
		
		
		StudentDao newUser = new StudentDao();
		newUser.setUsername(user.getUsername());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		newUser.setEmail(user.getEmail());
		newUser.setFirst_name(user.getFirst_name());
		newUser.setLast_name(user.getLast_name());
		newUser.setMobileNumber(user.getMobileNumber());
		
		Project pro = new Project();
		
		//newUser.setProject(pro.getDuration().se);
		//pro.setDuration(user.getProject().;
		return userDao.save(newUser);
	}
}