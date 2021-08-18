package com.at.examples.exceptions;

import javax.naming.NameNotFoundException;

class Customer {
	String name;
	Customer(String name) {
		this.name=name;
	}
}

public class CustomerService {
	public Customer findPerson(String name) throws NameNotEmpty {
		if (name.equals("")) {
			// create your own exception
			throw new NameNotEmpty("Name is empty..");
		}
		return new Customer(name);
	}
	public static void main(String[] args) throws NameNotEmpty {
		CustomerService customerService = new CustomerService();
		Customer customer = customerService.findPerson("");
	}
}
