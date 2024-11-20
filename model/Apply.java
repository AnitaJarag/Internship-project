package com.project.internship.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Apply {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name,email,city,phone,position;
	public Apply() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Apply(String name, String email, String city, String phone, String position) {
		super();
		this.name = name;
		this.email = email;
		this.city = city;
		this.phone = phone;
		this.position = position;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
}
