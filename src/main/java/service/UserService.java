package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.howtodoinjava.demo.model.User;

import repository.UserRepo;

public class UserService{

	@Autowired
	private UserRepo repository;
	
	//@Override
	public List<User> findAll() {

	    return (List<User>) repository.findAll();
	}
}
