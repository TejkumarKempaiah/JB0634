package com.Session21;

public class BuiltInMethods_6 
{
	
	public static void main(String[] args) 
	{
		String s1 = "Janbask";
		
		boolean value1 = s1.endsWith("bask");
		boolean value2 = s1.endsWith("ask");
		boolean value3 = s1.endsWith("Gotomeeting");
		
		System.out.println("Value1 = "+value1);
		System.out.println("Value2 = "+value2);
		System.out.println("Value3 = "+value3);
		
		
		String s2 = "Welcome to Janbask Training";
		String value4 = s2.substring(9);
		
		String s3 = "A B";
		String output = s3.substring(2);
		System.out.println("Output for s2 string is: "+s2.substring(7));
		System.out.println("Output for s2 string is: "+s2.substring(6));
		System.out.println("Output for s2 string is: "+s2.substring(5));
		
		
		System.out.println("Output = "+output);
		
		System.out.println("Value4 = "+value4);
		
		int length = s2.length();
		System.out.println("Length of s2 = "+length);	
	}
}
