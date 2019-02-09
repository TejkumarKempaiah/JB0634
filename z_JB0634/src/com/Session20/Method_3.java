package com.Session20;

public class Method_3 
{

	public static void main(String[] args) 
	{
		//call method1
		int value1 = method1();
		
		
		//call method2
		//create an object, call the method using the reference variable
		Method_3 m1 = new Method_3();
		 boolean value2 = m1.method2();		
		 
		 System.out.println(value1);
		 System.out.println(value2);
		
	}
	
	
	//user defined method
	public static int method1()
	{
		return 10;
	}
	
	public boolean method2()
	{
		
		return true;	
	}
	
	
	
	
	
}
