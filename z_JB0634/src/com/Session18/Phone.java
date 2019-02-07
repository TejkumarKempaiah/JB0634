package com.Session18;

public class Phone {
	// Global Variables
	String name;
	int price;
	String color;

	// main method
	public static void main(String[] args) 
	{
		// Object creation
		Phone p1 = new Phone();

		p1.name = "Samsung";
		p1.color = "White";
		p1.price = 123456;

		p1.call();
		p1.text();
		p1.takePhotos();
		
		System.out.println("Phone name is: "+p1.name);
		System.out.println("Phone color is: "+p1.color);
		System.out.println("Phone price is: "+p1.price);

	}

	// Methods of Phone object
	public void call() {
		System.out.println("Calling brother....");
	}

	public void text() {
		System.out.println("Texting mother....");
	}

	public void takePhotos() {
		System.out.println("Taking a picture...");
	}

}
