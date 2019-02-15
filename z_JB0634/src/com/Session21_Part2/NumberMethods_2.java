package com.Session21_Part2;

public class NumberMethods_2 
{

	public static void main(String[] args) 
	{
		System.out.println("--min() implementation--");
		int a = 10;
		int b = 20;
		System.out.println(Math.min(a, b));
		
		System.out.println("--max() implementation--");
		System.out.println(Math.max(a, b));
		
		System.out.println("--random() implementation--");
		System.out.println(Math.random()); 
		
		//Random Value generated when executed first time -> 0.5442422380019551
		//Random Value generated when executed second time ->0.6637884912880908
		//Random Value generated when executed third time ->0.368263305311173
		
	}

}
