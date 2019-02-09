package com.Session20;

public class Method_2 
{
	public static void main(String[] args) 
	{
		//Method Calling
		//Call method1 - STATIC
		method1();
		

		//Call method2 - NONSTATIC
		//Create object, Call the method using the reference variable
		Method_2 m1 = new Method_2();
		m1.method2();
			
	}
	
	
	//User defined methods
	public static void method1()
	{
		System.out.println("-STATIC-");
	}
	
	
	public void method2()
	{
		System.out.println("-NONSTATIC-");
	}	

}
