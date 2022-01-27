package com.springbootkafkaproducerexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.springbootkafkaproducerexample.model.Person;
import com.springbootkafkaproducerexample.model.User;

//@Service
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
