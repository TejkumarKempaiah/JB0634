package com.Session18;

public class ArrayDeclaration_Part1 {

	public static void main(String[] args) {

		// Type 1

		String[] s_array1 = { "QA", "DEV", "HR", "ADMIN" };
		int size1 = s_array1.length;
		System.out.println("Size of array (s_array1) is: " + size1);

		for (String string1 : s_array1) {
			System.out.println(string1);

		}

		System.out.println("--------------");

		// TYPE 2

		String[] s_array2 = new String[3]; // 0,1,2
		s_array2[0] = "API Testing";
		s_array2[1] = "Jmeter";
		s_array2[2] = "Selenium";
		int size2 = s_array2.length;
		System.out.println("Size of array (s_array2) is: " + size2);

		for (String string2 : s_array2) {
			System.out.println(string2);

		}

	}
}
