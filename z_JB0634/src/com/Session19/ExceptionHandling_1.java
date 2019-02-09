package com.Session19;
public class ExceptionHandling_1 
{
	public static int a;    //Global Variables
	
	public static void main(String[] args) 
	{
				try 
				{
					//Risky Code
					int p1 = 10/2;			
					System.out.println(p1); 
						
				}
				catch (Exception e) 
				{
					System.out.println("Exception handled successfully..");		
				}
		
				a = 10;
				System.out.println(a);
		
		
	}
}
