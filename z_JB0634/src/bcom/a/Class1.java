package bcom.a;

import bcom.b.Class2;

public class Class1 
{
	//main method, So execution is possible
	//call r1, r2 from Class2 into Class1
	
	public static void main(String[] args) 
	{
		Class2.r1();
		
		
		//Object creation of Class2 to access its non-static member(method)
		Class2 c2 = new Class2();
		c2.r2();
		
		System.out.println(Math.random());
		
	}

}
