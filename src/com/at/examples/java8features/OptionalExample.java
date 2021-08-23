package com.at.examples.java8features;

import java.util.Optional;

public class OptionalExample {
	// Optional class is generally used to avoid null pointer exceptions
	public Integer sum(Optional<Integer> number1, Optional<Integer> number2) {
		// System.out.println("First parameter: "+number1.get());
		// System.out.println("Second parameter: "+number2.get());
		// orElse is used to provide a default value if at all the value present is
		// null,
		// otherwise actual value is used
		Integer first = number1.orElse(0);
		Integer second = number2.orElse(3);
		return first + second;
	}

	public static void main(String[] args) {
		OptionalExample obj = new OptionalExample();
		Integer value1 = null;
		Integer value2 = 30;
		Optional<Integer> val1 = Optional.ofNullable(value1);
		Optional<Integer> val2 = Optional.ofNullable(value2);
		System.out.println("Sum is: " + obj.sum(val1, val2));
	}

}
