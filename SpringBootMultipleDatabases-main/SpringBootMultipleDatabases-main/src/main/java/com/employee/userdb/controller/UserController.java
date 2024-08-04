package com.employee.userdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.userdb.entity.User;
import com.employee.userdb.repository.UserRepository;

@RestController
public class UserController {
	@Autowired
	UserRepository userRepository;

	@PostMapping("api/v1/user")
	public User saveUser(@RequestBody User user) {
		return userRepository.save(user);
	}

	@GetMapping("api/v1/users")
	public List<User> getUserList() {
		return userRepository.findAll();

	}

}
