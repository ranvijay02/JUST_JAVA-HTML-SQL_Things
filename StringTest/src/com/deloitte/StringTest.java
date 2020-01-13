package com.deloitte;

public class StringTest {
	
	private String str= "Hello";
	public StringTest() {
		
		System.out.println("str: "+str);
		modify(str);
		System.out.println("now str: "+str);
		StringBuilder sb = new StringBuilder("Hello");
		modify(sb);
		System.out.println("sb: " +sb);
	}
	
	private void modify(StringBuilder sb) {
		sb.append(" guys");
		
	}

	private void modify(String str) {
		str = str + " guys";
		System.out.println("Here str: " +str);
		System.out.println("this.str: " + this.str);
		System.out.println(this.str == str);
	}

	public static void main(String[] args) {
		new StringTest();

	}

}
