package com.educandoweb.course.entities;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@EqualsAndHashCode(of = "id")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	// attributes
	private Long id;
	private String name;
	private String email;
	private String phone;
	private String password;
	
	// empty constructor
	public User() {}
	
	// all args constructor
	public User(Long id, String name, String email, String phone, String password) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}
	
	
	
}
