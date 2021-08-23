package com.at.examples.java8features;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeExample {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println("Current Time is: "+time);
		
		LocalTime specificTime = LocalTime.of(12, 25, 55);
		System.out.println("Specific time of the day: "+specificTime);
		
		LocalTime parisTime = LocalTime.now(ZoneId.of("Europe/Paris"));
		System.out.println("Time at zone: " +parisTime);
		
		LocalTime basedonSecs = LocalTime.ofSecondOfDay(85000);
		System.out.println("Time based on seconds: "+basedonSecs);
		
		//try other methods

	}

}
