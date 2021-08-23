package com.at.examples.java8features;

import java.util.Optional;

public class SimpleOptional {

	public static void main(String[] args) {
		String str[] = new String[10];
		//System.out.println("First element: "+str[9].concat("Hello"));
		//str[9]="Hello ";
		Optional<String> checkforNull = Optional.ofNullable(str[9]);
		System.out.println("...." +checkforNull);//Optional.empty
		if(checkforNull.isPresent()) {
			System.out.println(str[9].concat("World"));
		} else {
			System.out.println("String value is null");
		}

	}

}
