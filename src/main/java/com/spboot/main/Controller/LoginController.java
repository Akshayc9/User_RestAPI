package com.spboot.main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spboot.main.Entity.User;
import com.spboot.main.Service.UserService;

@RestController
@RequestMapping("/api/v1")
public class LoginController {

	@Autowired
	UserService userService;

	@GetMapping("/authenticate/{empId}")
	public boolean getUserStatus(@PathVariable Long empId) {

		User user = userService.getById(empId);
		if (user.getPassword().equals(user.getConfirmPassword())) {
			System.out.println("User Login Successful");
			return true;
		}
		System.out.println("Password Incorrect");
		return false;
	}
}
