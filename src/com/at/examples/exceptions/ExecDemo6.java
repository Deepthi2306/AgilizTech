package com.at.examples.exceptions;

public class ExecDemo6 {

	public static void main(String[] args) {
		try {
			throw new Exception();//creating exception manually
		} catch (Exception e) {
			System.out.println("Catching some exception..");
		}
	}
}
