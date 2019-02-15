package com.Session21_Part2;
import java.util.Arrays;
public class ArraysMethods_1 {
	public static void main(String[] args) {
		int a = 10;
		int[] a1 = {0,1,2,3,4,5,6,7,8,9,10,11};
		
		for (int i : a1) 
		{
			System.out.println(i);
		}
		
		System.out.println("-----");
	
		System.out.println(a1.length);
		
		System.out.println("-----");
		
		System.out.println(a1.toString());
		
		System.out.println("-----");
		
		String[] s1 = {"QA", "DEV", "HR", "IT"};
		boolean o1 = Arrays.asList(s1).contains("DEV");
		boolean o2 = Arrays.asList(s1).contains("Dev-Ops");
		
		System.out.println(o1);
		System.out.println(o2);		
	}
}
