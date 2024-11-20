package com.project.internship.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.internship.Repository.RegisterRepository;
import com.project.internship.model.Register;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/internship/")
public class RegisterController {

	@Autowired
	@Qualifier("regRepo")
	RegisterRepository regRepo;
	
	@GetMapping("/register")
	public ArrayList<Register> register()
	{
		return (ArrayList<Register>)regRepo.findAll();
	}
	@PostMapping ("/register")
	public Register handlepost(@RequestBody Register r)
	{
		return regRepo.save(r);
	}
	@GetMapping("/register/{emailid}/{password}")
	   public Register login(@PathVariable("emailid")String emailid,@PathVariable("password")String password)
	   {
		   return regRepo.findByEmailIdAndPassword(emailid, password);
	   }
}
