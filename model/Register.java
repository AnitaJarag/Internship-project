package com.project.internship.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Register {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
private String name,mobileno,city,emailid,password;
public Register() {
	super();
	// TODO Auto-generated constructor stub
}
public Register(String name, String mobileno, String city, String emailid, String password) {
	super();
	this.name = name;
	this.mobileno = mobileno;
	this.city = city;
	this.emailid = emailid;
	this.password = password;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMobileno() {
	return mobileno;
}
public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
