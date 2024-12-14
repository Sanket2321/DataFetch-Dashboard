package net.javaguide.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguide.springboot.model.User;
import net.javaguide.springboot.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	public List<User> getUser(){
		return userRepository.findAll();
	}
	
	

}
