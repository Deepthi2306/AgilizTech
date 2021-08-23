package com.at.examples.java8features;

public interface I {

	public default void show() {
		System.out.println("Inside show of I interface...");
	}
}
