package com.at.examples.strings;

public class Conversions {

	public static void main(String[] args) {
		//Converting String to StringBuffer
		String str="AgilizTech";
		StringBuffer buffer = new StringBuffer(str);
		buffer.append(" for your future..");
		System.out.println(buffer);
		//Converting StringBuffer/Builder to String
		StringBuffer buffer1 = new StringBuffer("TechnoElevate");
		StringBuilder builder1 = new StringBuilder("TechnoElevate1");
		
		String str_stringbuffer = buffer1.toString();
		System.out.println("Converted from StringBuffer to String object: "+str_stringbuffer);
		
		String str_stringbuilder = builder1.toString();
		System.out.println("Converted from StringBuffer to String object: "+str_stringbuilder);
		
		//To convert from StringBuffer to StringBuilder, first convert it into a String
		
	}

}
