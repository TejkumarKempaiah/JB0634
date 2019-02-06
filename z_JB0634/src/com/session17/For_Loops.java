package com.session17;
//Code re-usabiliy is one of the best practises from both Dev/QA Autoomation
public class For_Loops 
{
	public static void main(String[] args) 
	{
		int count = 0;
		
		//Introduce loops -> Loops are used to overcome the repetative tasks
		//print Helloworld 10 times
		
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println("Hellowworld");
			count ++;  //1,2.......10
		}
		
		System.out.println("Count is: "+count);
	}
}
