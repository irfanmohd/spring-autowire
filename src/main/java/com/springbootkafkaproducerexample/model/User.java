package com.springbootkafkaproducerexample.model;

public class User {

	Address address;

	public User() {
		super();
	}

	public User(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
