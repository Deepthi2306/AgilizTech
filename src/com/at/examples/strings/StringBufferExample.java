package com.at.examples.strings;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("Hello");
		buffer.append("World!");//does the same job as concat
		System.out.println(buffer);
	}
}
