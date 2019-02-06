package com.session17;

public class ConditionalStatements_2 
{
	public static void main(String[] args) 
	{
		String s1 = "Sunday";
		
		switch (s1) 
		{
		case "Monday": System.out.println("Working day");break;
		case "Tuesday": System.out.println("Working day");break;
		case "Wednesday": System.out.println("Working day");break;
		case "Thursday": System.out.println("Working day");break;
		case "Friday": System.out.println("Working day");break;
		case "Saturday": System.out.println("Non-Working day");break;
		case "Sunday": System.out.println("Non-Working day");break;

		default: System.out.println("Please enter a valid day...");break;
		}
		
		System.out.println("The program just came out of switch case... ");
	}
}
