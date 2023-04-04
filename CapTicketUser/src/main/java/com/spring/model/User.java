package com.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Date;

@Entity
@Table(name="userticket")
public class User {

    // Propiedades de la entidad User
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String lastname;
    private String password;
    private String mail;
    private Date registerdate;
	public int getId() {
		return id;
	}
	
	public User() {
		super();
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Date getRegisterdate() {
		return registerdate;
	}
	public void setRegisterdate(Date registerdate) {
		this.registerdate = registerdate;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", lastname=" + lastname + ", password=" + password + ", mail="
				+ mail + ", registerdate=" + registerdate + "]";
	}
	public User(int id, String name, String lastname, String password, String mail, Date registerdate) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.password = password;
		this.mail = mail;
		this.registerdate = registerdate;
	}

   
}
