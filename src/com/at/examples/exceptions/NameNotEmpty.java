package com.at.examples.exceptions;
//Custom checked exception class
public class NameNotEmpty extends Exception{	
	public NameNotEmpty(String message) {
		super(message);
	}

}
