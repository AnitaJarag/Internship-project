package com.project.internship.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.internship.Repository.ContactRepository;
import com.project.internship.model.Contact;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/internship/")
public class ContactController {
	@Autowired
	@Qualifier("contRepo")
	ContactRepository contRepo;
	@GetMapping("/contact")
	public ArrayList<Contact> contact()
	{
		return (ArrayList<Contact>)contRepo.findAll();
	}
	@PostMapping ("/contact")
	public Contact handlepost(@RequestBody Contact c)
	{
		return contRepo.save(c);
	}
}
