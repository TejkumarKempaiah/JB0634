package com.Session20;

public class Method_4 
{
	//create methods which will accept certain things
	
	public static void main(String[] args) 
	{
		//method calling
		//call method1
		method1(1000);
		
		//call method2
		Method_4 m4 = new Method_4();
		m4.method2("Please do my task");	
	}
	

	//static method which will take some things for doing the task
	public static void method1(int a)
	{
		System.out.println("The value given by the method caller is: "+a);
	}
	
	
	//nonstatic method which will take something for doing the task
	public void method2(String s1) 
	{
		System.out.println("The value given by the method caller is: "+s1);
	}	
	
}
