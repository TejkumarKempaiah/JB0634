package com.Session20;

import java.util.Scanner;

public class ScannerClass_Demo
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter byte value...");
		byte b1 = s1.nextByte();
		
		System.out.println("The value taken from the user is: "+b1);		
	}	
}
