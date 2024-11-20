package com.project.internship.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.internship.Repository.AdminLoginRepository;
import com.project.internship.model.AdminLogin;

@RestController
@CrossOrigin(origins ="http://localhost:4200")
@RequestMapping("/internship")
public class AdminLoginController {
	@Autowired
    @Qualifier("admRepo")
	AdminLoginRepository admRepo ;
	@GetMapping("/AdminLogin/{emailid}/{password}")
	   public AdminLogin login(@PathVariable("emailid")String emailid,@PathVariable("password")String password)
	   {
		   return admRepo.findByEmailIdAndPassword(emailid, password);
	   }
}
