package com.Session21;

public class BuiltInMethods_4 {

	public static void main(String[] args) {
		
		
		String s1 = "Selenium";
		char value1 = s1.charAt(2);
		
		System.out.println("Value1 = "+value1);
		
		
		String s2 = "SELENIUM";
		String s3 = "Selenium";
		
		boolean value2 = s1.equals(s2);
		boolean value3 = s1.equalsIgnoreCase(s2);
		
		System.out.println("Value2 = "+value2);
		System.out.println("Value3 = "+value3);

	}

}
