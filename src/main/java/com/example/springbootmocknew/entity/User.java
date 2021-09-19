package com.example.springbootmocknew.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Document
@Data
@AllArgsConstructor

public class User {
	@Id
  private String id;
  private String first_name;
  private String last_name;
  private String email;
  private String gender;
  private String ip_address;
  
}
