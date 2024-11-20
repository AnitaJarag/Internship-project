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

import com.project.internship.Repository.ApplyRepository;
import com.project.internship.model.Apply;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/internship/")
public class ApplyController {
	@Autowired
	@Qualifier("apRepo")
	ApplyRepository apRepo;
	@GetMapping("/apply")
	public ArrayList<Apply> apply()
	{
		return (ArrayList<Apply>)apRepo.findAll();
	}
	@PostMapping ("/apply")
	public Apply handlepost(@RequestBody Apply a)
	{
		return apRepo.save(a);
	}
}
