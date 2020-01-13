package com.deloitte;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileDemo {
	public static void main(String[] args) {
		File file=new File("deloitte");
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
		if(file.isDirectory()) {
			String[] list=file.list();
			for(String fname:list) {
				System.out.println(fname);
			}
		}
		System.out.println(new Date(file.lastModified()));
		File f = new File("dir1");
		f.mkdir();
		try {
			FileWriter fw = new FileWriter("dir1/f1.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

