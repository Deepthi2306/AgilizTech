package com.at.examples.exceptions;

import java.io.IOException;

class Example{
	public void myMethod(int number) throws IOException, ClassNotFoundException {
		if(number==1)
			throw new IOException("IOException occurred..");
			else
			throw new ClassNotFoundException("ClassNotFoundException occurred..");
	}
}

public class ExecDemo9 {
	public static void main(String[] args) {
		Example e = new Example();
		try {
			e.myMethod(1);
		} catch (Exception e1) {
			System.out.println(e1);
		}
	}
}
