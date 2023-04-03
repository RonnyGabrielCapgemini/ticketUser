package com.spring.response;

import java.io.Serializable;

import com.spring.model.User;

public class UserDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String lastname;
	private String mail;
	
	public static UserDTO of(User user) {
		UserDTO userDto= new UserDTO();
		userDto.setId(user.getId());
		userDto.setName(user.getName());
		userDto.setLastname(user.getLastName());
		userDto.setMail(user.getMail());
		return userDto;
	}
	
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", name=" + name + ", lastname=" + lastname + ", mail=" + mail + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
}
