package com.at.examples.basic;

public class Car implements Vehicle {

	@Override
	public void speedUp() {
		System.out.println("Speeding up car..");		
	}

	@Override
	public void changeGear() {
		System.out.println("Changing the gear of a car...");
		
	}

	@Override
	public void applyBrake() {
		System.out.println("Applying brakes for a car...");
		
	}

}
