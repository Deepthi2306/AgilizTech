package com.at.examples.inheritance;

class CPU{
	class Processor{
		double cores;
		String manufacturer;
		double getCache(){
			return 4.5;
		}		
	}
	class RAM{
		double memory;
		String manufacturer;
		double getClockSpeed(){
			return 5.5;
		}
	}
}

public class CPUMain {
	public static void main(String[] args) {
		CPU cpuObject = new CPU();
		CPU.RAM ramobject = cpuObject.new RAM();
		System.out.println("RAM clock speed: " +ramobject.getClockSpeed());
		CPU.Processor processorobject = cpuObject.new Processor();
		System.out.println("Processor cache value: " +processorobject.getCache());

	}

}
