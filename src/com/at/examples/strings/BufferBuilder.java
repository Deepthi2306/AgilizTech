package com.at.examples.strings;
//This program proves that StringBuffer is less efficient compared to StringBuilder
public class BufferBuilder {

	public static void main(String[] args) {
		long starttime = System.currentTimeMillis();
		
		StringBuffer stringBuffer = new StringBuffer("Java");
		
		for(int i=0;i<10000;i++) {
			stringBuffer.append("World");
		}
		System.out.println("Time taken to execute using String Buffer:  "
		+(System.currentTimeMillis() - starttime));
		starttime = System.currentTimeMillis();
		StringBuilder stringBuilder = new StringBuilder("Java");
		
		for(int i=0;i<10000;i++) {
			stringBuilder.append("World");
		}
		System.out.println("Time taken to execute using String Builder: "
		+(System.currentTimeMillis() - starttime));
	}

}
