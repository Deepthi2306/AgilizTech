package com.at.examples.java8features;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class LocalDateExample {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("Todays date is: "+today);
		
		LocalDate someday = LocalDate.of(2012, Month.FEBRUARY, 2);
		System.out.println("Some days date is: "+someday);
		//Based on ZoneId's
		LocalDate fromZone = LocalDate.now(ZoneId.of("America/Chicago"));
		System.out.println("Current date with zone id: " +fromZone);
		//wrt EpochDay
		LocalDate datefromEpoch = LocalDate.ofEpochDay(365);
		System.out.println("Trying epoch Date..." +datefromEpoch);
		
		//Try other methods
	}

}
