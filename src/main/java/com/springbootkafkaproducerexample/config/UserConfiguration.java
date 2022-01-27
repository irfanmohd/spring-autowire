package com.springbootkafkaproducerexample.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springbootkafkaproducerexample.model.Address;
import com.springbootkafkaproducerexample.model.Manager;
import com.springbootkafkaproducerexample.model.Person;
import com.springbootkafkaproducerexample.model.Student;
import com.springbootkafkaproducerexample.model.User;
import com.springbootkafkaproducerexample.service.UserService;

@Configuration
public class UserConfiguration {

	@Bean
	@Qualifier("student")
	public Person createStudent() {

		return new Student();
	}

	@Bean
	@Qualifier("manager")
	public Person createManager() {

		return new Manager();
	}

	@Bean
	public UserService userService() {
		return new UserService();
	}
	
	@Bean
	@Qualifier("add1")
	public Address address() {
		return new Address();
	}

	
	@Bean
	@Qualifier("add2")
	public Address address2() {
		return new Address();
	}

	
	@Bean
	public User user(Address address) {
		return new User(address);
	}
}
