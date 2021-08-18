package com.at.examples.exceptions;

//demonstrating simple try/catch
public class ExecDemo1 {

	public static void main(String[] args) {
		// int[] numbers = new int[4];//index from 0 to 3
		try {
			// numbers[4]=100;
			// String str = null;
			// System.out.println(str.length());
			//int number = 50 / 0;
			String str = "TechnoElevate";
			int converted_value = Integer.parseInt(str);
			//Handle specific exception type or general exception type
			//Handling exception using wrong exception type, will be ignored
		} catch (NumberFormatException e) {
			System.out.println("Some issue occured.....pls re-login!");
			// differentiate between using out and err from the System class
			 //e.printStackTrace();
			// note the use of printStackTrace() method
		}

	}

}
