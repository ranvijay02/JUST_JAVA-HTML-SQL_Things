
package com.deloitte;

import java.util.Scanner;

public class DigitCount {
	
	private boolean validate(String input) {
		//returns true only if the input string contains 5 digits
		return input.matches("\\d{5}"); // \\d means digits
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a 5 digit number");
		String input = scan.nextLine();
		DigitCount dg = new DigitCount();
		boolean valid = dg.validate(input);
		System.out.println("Input valid = " +valid);

	}


}
