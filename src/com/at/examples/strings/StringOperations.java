package com.at.examples.strings;

public class StringOperations {

	public static void main(String[] args) {
		String str1 = "Java is fun to learn";
		String str2 = "Java";
		String str3 = "Ja";

		System.out.println("Length of string is: " + str1.length());
		System.out.println("Char at 6th position: " + str1.charAt(6));

		System.out.println("Index of character f: " + str1.indexOf('a'));

		System.out.println("Last index of character a: " + str1.lastIndexOf('a'));

		System.out.println("substring with single parameter: " + str1.substring(10));

		System.out.println("substring with two parameters: " + str1.substring(1, 6)); // 1 included but 6 excluded

		System.out.println("Concatenated string: " + str1.concat(str2));

		System.out.println("Trimming the spaces: " + str2.trim());
		// results in positive, negative or zero as integer value based on comparison
		System.out.println("Comparing two strings: " + str2.compareTo(str3));
		
		System.out.println("Upper case: " +str2.toUpperCase());
		System.out.println("Lower case: "+str2.toLowerCase());

	}

}
