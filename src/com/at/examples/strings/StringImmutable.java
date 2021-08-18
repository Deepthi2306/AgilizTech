package com.at.examples.strings;

public class StringImmutable {

	public static void main(String[] args) {
		String str = "Techno";//String constant pool
		str = str.concat("Elevate"); //TechnoElevate
		System.out.println(str);
	}
}
