package com.howtodoinjava.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.demo.model.User;

import repository.UserRepo;
import service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping("/")
    public List<User> getUsers() 
    {
		List<User> userList = new ArrayList<User>();
		//userList.add(new User());
		return userList;
    }

}
