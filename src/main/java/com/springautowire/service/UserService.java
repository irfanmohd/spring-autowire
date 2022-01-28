package com.springautowire.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.springautowire.model.Person;
import com.springautowire.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	@Qualifier("manager")
	private Person p1;
	
	@Autowired
	private User user;
	

	public void printObject() {
		System.out.println(p1.info());

	}
	
	public void printAddress() {
		System.out.println(user.getAddress());

	}

}
