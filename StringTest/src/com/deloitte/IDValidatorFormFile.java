package com.deloitte;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IDValidatorFormFile {
	private Pattern pattern;
	private Matcher matcher;
	private String regex = "\\d{3}-\\d{2}-\\d{4}";

	public IDValidatorFormFile() {
		pattern = Pattern.compile(regex);
	}

	private boolean validate(String input) {
		matcher = pattern.matcher(input);
		return matcher.matches();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BufferedReader br = null;
		try {
			IDValidatorFormFile idv = new IDValidatorFormFile();
			FileReader fr = new FileReader("idvalues.txt");
			br = new BufferedReader(fr);
			String input = "";
			while ((input = br.readLine())!= null) {
				boolean valid = idv.validate(input.trim());
				System.out.println("ID " + input + "valid = " + valid);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {

				}
			}
		}

	}

}
