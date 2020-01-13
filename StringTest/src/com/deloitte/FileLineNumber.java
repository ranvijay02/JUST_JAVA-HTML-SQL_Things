package com.deloitte;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class FileLineNumber {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("output.txt");
			br = new BufferedReader(fr);
			LineNumberReader lnr = new LineNumberReader(br);
			String line = "";
			while((line = lnr.readLine()) != null) {
				System.out.println(lnr.getLineNumber() + " : " +line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
