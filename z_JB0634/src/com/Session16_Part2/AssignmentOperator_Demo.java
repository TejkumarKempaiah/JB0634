package com.Session16_Part2;

public class AssignmentOperator_Demo 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		
		System.out.println(a);  //10
		System.out.println(b);  //20
		
		int c = a;   //Assignment operator 
		
		int d = a + 10;
		
		int e = a+=10;   // a = a+ 10;
		

		System.out.println(c);  //10
		System.out.println(d);  //10 + 10 = 20
		System.out.println(e);	//20
	}
}
