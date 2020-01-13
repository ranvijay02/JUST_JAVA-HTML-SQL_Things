package com.deloitte;

import java.util.Scanner;

public class IDValidator {


	private boolean validate(String input) {
		return input.matches("\\d{3}-\\d{2}-\\d{4}");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the ID to validate");
		String input = scan.nextLine();
		IDValidator idv = new IDValidator();
		boolean valid = idv.validate(input);
		System.out.println("Input valid = " +valid);

	}

}
