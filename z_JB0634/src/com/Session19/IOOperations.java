package com.Session19;

import java.util.Scanner;

public class IOOperations {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the integer value:");
		int i1 = s1.nextInt();
		System.out.println("The value of i1 is: " + i1);

		System.out.println("Enter boolean value");
		boolean b1 = s1.nextBoolean();
		System.out.println("The value of b1 is: " + b1);

		System.out.println("Enter String value");
		String s11 = s1.next();
		System.out.println("The value of s11-String is: " + s11);

	}

}
