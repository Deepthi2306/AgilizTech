package com.at.examples.java8features;

public class MainClass {

	public static void main(String[] args) {
		Vehicle car = new Car();
		System.out.println(car.changeGear());
		System.out.println(car.applyBrake());
		System.out.println(car.speedUp());
		System.out.println(car.blowUpAlarm());
		System.out.println(Vehicle.blowUpAirBags());
	}

}
