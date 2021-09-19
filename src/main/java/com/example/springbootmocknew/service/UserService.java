package com.example.springbootmocknew.service;

import java.util.List;

import com.example.springbootmocknew.entity.User;

public interface UserService {
	public User saveUser(User user);
	
	public List<User>getUsers();
	
}
