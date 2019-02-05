package com.Session16_Part2;

public class Variables_Demo 			//Class 
{
	//Variables declaration - TYPE 1
	public static int a = 10;    //Globally accessible -> Global Variables
	
		public static void main(String[] args)    //method -> Main Method
		{
			//Variables declaration - TYPE 2
			int b = 20;               //local variable
			
			
			System.out.println("A = "+a);
			System.out.println("B = "+b);
			
			method1();
		
		}
			
		public static void method1()
		{
			System.out.println("A = "+a);		
		}
		
}
