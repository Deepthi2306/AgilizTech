package com.at.examples.basic;

public class Bike implements Vehicle {

	@Override
	public void speedUp() {
		System.out.println("Speeding up Bike...");		
	}

	@Override
	public void changeGear() {
		System.out.println("Changing the gear for bike...");		
	}

	@Override
	public void applyBrake() {
		System.out.println("Applying the brakes for a bike..");
		
	}

}
