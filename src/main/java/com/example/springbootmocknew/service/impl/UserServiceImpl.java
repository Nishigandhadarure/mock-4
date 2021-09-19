package com.example.springbootmocknew.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootmocknew.entity.User;
import com.example.springbootmocknew.repository.UserRepository;
import com.example.springbootmocknew.service.UserService;

@Service
public class UserServiceImpl implements UserService{
    @Autowired 
    private UserRepository userRepository;
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}
