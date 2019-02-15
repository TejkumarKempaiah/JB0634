package com.Session21_Part2;
public class NumberMethods_1 {

	public static void main(String[] args) 
	{
		System.out.println("----comparesTo() method implementastion---");
		
		int a = 0;
		Integer a1 = a;
		int b = 2;
		Integer b1 = b;
		
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(a1.compareTo(b1));	
		
		System.out.println("----equals() method implementastion---");
		
		int x = 10;
		int y = 20;		
		
		Integer x1 = x;
		Integer y1 = y;
		
		System.out.println(x1.equals(y1));	
		System.out.println("----abs() method implementastion---");
		
		int p = -10;
		int value1 = Math.abs(a);
		
		double d1 = -10.50;
		
		System.out.println("Absolute value is: "+value1);
		System.out.println("Absolute value is: "+Math.abs(a));	
		System.out.println("Absolute value for double "+Math.abs(d1));
		System.out.println("----round() method implementastion---");
		
		double m1 = 200.2;
		double m2 = 200.5;
		double m3 = 200.6;
		
		System.out.println(Math.round(m1));
		System.out.println(Math.round(m2));
		System.out.println(Math.round(m3));		
	}
}
