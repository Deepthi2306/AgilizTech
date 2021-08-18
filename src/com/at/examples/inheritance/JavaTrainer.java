package com.at.examples.inheritance;
//Child class
public class JavaTrainer extends Trainer {
	
	String subject="Java";
	
	public static void main(String[] args) {
		JavaTrainer object = new JavaTrainer();
		
		System.out.println("Company Name: "+object.companyName);
		System.out.println("Designation: " +object.designation);
		System.out.println("Subject: "+object.subject);
		object.work();
	}

}
