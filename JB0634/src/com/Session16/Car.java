package com.Session16;

public class Car 
{
	public static void main(String[] args) 			//Main Method is static
	{
		//Creating a Car Object
		Car c1 = new Car();
			
		c1.startEngine();
		c1.driverTheCar();
		c1.stopCar();
		
		breathe();
	}
	
	public void startEngine()			//method is non-static in nature
	{
		System.out.println("Car Started");

	}
	
	public void driverTheCar()			//method is non-static in nature
	{
		System.out.println("Driving...");
	}

	public void stopCar()				//method is non-static in nature
	{
		System.out.println("Car Stopped");
	}
	
	public static void breathe()		//static method
	{
		System.out.println("I'm able to breathe...");
	}	
}
