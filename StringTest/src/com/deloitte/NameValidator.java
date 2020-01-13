package com.deloitte;

import java.util.Scanner;

public class NameValidator {


	private boolean validate(String input) {
		return input.matches("[A-Z][a-zA-Z]+"); // + indicates 1 or more, * indicates 0 or more
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Name");
		String input = scan.nextLine();
		NameValidator idv = new NameValidator();
		boolean valid = idv.validate(input);
		System.out.println("Input valid = " +valid);

	}

}
