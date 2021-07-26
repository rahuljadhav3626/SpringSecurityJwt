package com.neosoft.app.main.studentjwt.model;

import java.io.Serializable;

import javassist.SerialVersionUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JwtRequest implements Serializable {
	

	private String username;
	private String password;
	

}
