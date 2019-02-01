package com.Session15;

//Owner: Tejkumar, Objective: This java program illustrates the Looping concepts: for loop
//This program prints Helloworld 20 times to the console and also shows the number of times its printed(In count variable)
public class Test2 
{
	//main method
	public static void main(String[] args) 
	{
		//Print Helloworld 20 Times
			
		//Repetative Task: Looping
		
		int count = 0;
		
		for (int i = 0; i < 20; i++) //for loop
		{
			System.out.println("Helloworld");
			count++;
		}
		System.out.println("Count = "+count);		
	}
}
