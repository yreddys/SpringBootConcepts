package in.yarraneella.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.yarraneella.entity.User;
import in.yarraneella.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/{id}")
	public User getUser(@PathVariable Long id) {
		return userService.getUser(id);
	}

	@PostMapping
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
}