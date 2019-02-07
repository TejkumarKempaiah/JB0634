package com.Session18;

public class Strings_2 
{
	public static void main(String[] args) 
	{
		String s1 = "Manual";
		String s2 = "QA";
		String s3 = "Engineer";
		
		//Concat all the strings
		
		System.out.println("-------Without Using String functions or String methods-------");
		
		System.out.println(s1+s2);			//ManualQA
		System.out.println(s1+s2+s3);		//ManualQAEngineer

		
		System.out.println("-------Using String functions or String methods-------");
		//s1.concat(2)
		
		System.out.println(s1.concat(s2));
		
		String result1 = s1.concat(s2); 		//ManualQA
		String result2 = result1.concat(s3); 	//ManualQAEngineer
		
		System.out.println("Result 2: "+result2);		
	}
}
