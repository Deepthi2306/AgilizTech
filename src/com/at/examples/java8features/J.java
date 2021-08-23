package com.at.examples.java8features;

public interface J {
	
	public default void show() {
		System.out.println("Inside show of J interface...");
	}

}
