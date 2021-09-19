package com.example.springbootmocknew.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootmocknew.entity.User;
import com.example.springbootmocknew.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userserivce;
	@PostMapping("/save")
	public User saveUser(@RequestBody User user) {
	return	userserivce.saveUser(user);
	}
	@GetMapping("/list")
	public List<User> getUsers(@RequestBody User user) {
		return	userserivce.getUsers();
		}

}
