package com.at.examples.java8features;

public interface Vehicle {
	
	 String changeGear();
	 String applyBrake();
	 String speedUp();
	 
	 default String blowUpAlarm(){
		 return "Turning the Alarm on...";
	 }
	 
	 static String blowUpAirBags() {
		 return "Blow-up the Airbags...";
	 }

}
