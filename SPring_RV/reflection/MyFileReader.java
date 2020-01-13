package com.deloitte;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {

//	public MyFileReader() {
//		System.out.println();
//	}

//	public static void main(String[] args) {
//		new MyFileReader();
//	}

	public String getName() {
		FileReader fr = null;
		BufferedReader br = null;
		String line = "";
		try {
			fr = new FileReader("emp.config");
			br = new BufferedReader(fr);
			line = br.readLine();
			System.out.println(line);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {
				}
		}
		return line;
	}
}
