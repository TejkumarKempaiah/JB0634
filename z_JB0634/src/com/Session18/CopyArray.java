package com.Session18;

public class CopyArray {

	public static void main(String[] args) {

		// 1st Array
		int[] i1 = { 0, 9, 8, 6 };
		System.out.println("Size of Array1: " + i1.length);

		// 2nd Array
		int[] i2;

		int a = 10;
		int b = a;

		i2 = i1;
		System.out.println("Size of Array2: " + i2.length);

		// print array1
		for (int array1 : i1) {
			System.out.println(array1);

		}

		System.out.println("----------------");

		// print array2
		for (int array2 : i2) {
			System.out.println(array2);
		}

	}

}
