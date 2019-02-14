package com.Session21;

public class BuiltInMethods_1 
{

	public static void main(String[] args) 
	{
		String s1  = "Janbask";
		String s2 = "JANBASK";
		
		int value1 = s1.compareToIgnoreCase(s2);
		
		System.out.println("The output for compareToIgnoreCase is: "+value1);
		
		int value2 = s1.compareTo(s2);
		
		System.out.println("The output for compareTo is: "+value2);	

	}

}
