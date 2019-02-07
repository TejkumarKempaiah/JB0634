package com.Session18;

public class Strings_3 {
	public static void main(String[] args) {
		String s1 = "QAEngineer";
		String s2 = "QAE";

//			//2 way comparision
//			yes 
//			no
//			
//			//3 way comparision
//			0
//			+ve
//			-ve

		System.out.println("----Without Using String methods----");

		boolean result1 = (s1 == s2);
		System.out.println("Is s1 and s2 equal:? " + result1);

		System.out.println("----Using String methods----");

		boolean result2 = s1.equals(s2);
		System.out.println("Is s1 and s2 equal: ? " + result2);

		int result3 = s1.compareTo(s2);
		System.out.println("Result3 = " + result3);

	}
}
