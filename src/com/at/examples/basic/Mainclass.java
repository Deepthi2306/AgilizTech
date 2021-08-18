package com.at.examples.basic;

public class Mainclass {

	public static void main(String[] args) {
		Car carObject = new Car();
		carObject.speedUp();
		carObject.changeGear();
		carObject.applyBrake();
		System.out.println("----------------------");
		Bike bikeObject = new Bike();
		bikeObject.speedUp();
		bikeObject.changeGear();
		bikeObject.applyBrake();

	}

}
