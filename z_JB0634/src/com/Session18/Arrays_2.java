package com.Session18;

public class Arrays_2 {

	public static void main(String[] args) {

		int[] i1 = { 1, 2, 3, 4, 5 };
		char[] c1 = { 'a', 'b', 'c', 'd' };
		boolean[] b1 = { true, false, true, false };

		// print int array
		System.out.println("Inteter Array Size: " + i1.length);
		for (int i : i1) {
			System.out.println(i);
		}

		System.out.println("-------------");

		// print character array
		System.out.println("Character Array Size: " + c1.length);
		for (char c : c1) {
			System.out.println(c);
		}

		System.out.println("-------------");
		// print boolean array
		System.out.println("Boolean Array Size: " + b1.length);
		for (boolean b : b1) {
			System.out.println(b);
		}
	}
}
