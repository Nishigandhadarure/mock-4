package com.example.springbootmocknew.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.springbootmocknew.entity.User;

public interface UserRepository extends MongoRepository<User,String> {

}
