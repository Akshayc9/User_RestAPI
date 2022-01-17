package com.spboot.main.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spboot.main.Entity.User;
import com.spboot.main.Service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/users")
	public ResponseEntity<List<User>> getUsers() {

		List<User> users = userService.findAll();
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);

	}

	@GetMapping("/users/{empId}")
	public ResponseEntity<User> getUser(@PathVariable Long empId) {
		Optional<User> uId = userService.findById(empId);
		if (uId.isPresent()) {
			return ResponseEntity.of(userService.findById(empId));
		}
		return ResponseEntity.notFound().build();
	}

	@GetMapping("/{empRole}")
	public ResponseEntity<List<User>> getUsersByEmpRole(@PathVariable String empRole) {

		List<User> users = userService.findByempRole(empRole);
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}

	@PostMapping("/submit")
	public String submitUser(@RequestBody User user) {
		userService.save(user);
		return "User added successfully";
	}

	@PutMapping("/update")
	public String updateUser(@RequestBody User user) {

		Optional<User> newUser = userService.findById(user.getEmpId());
		if (newUser.isPresent()) {

			User user2 = newUser.get();
			if (user2.getEmpRole() != "ADMIN") {
				user2.setEmpRole("ADMIN");
			}
			userService.save(user2);
		}
		return "User Role Successfully Updated";

	}

}
