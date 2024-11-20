package com.project.internship.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Feedback {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
private String name ,suggestion;
public Feedback() {
	super();
	// TODO Auto-generated constructor stub
}
public Feedback(String name, String suggestion) {
	super();
	this.name = name;
	this.suggestion = suggestion;
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
public String getSuggestion() {
	return suggestion;
}
public void setSuggestion(String suggestion) {
	this.suggestion = suggestion;
}

}
