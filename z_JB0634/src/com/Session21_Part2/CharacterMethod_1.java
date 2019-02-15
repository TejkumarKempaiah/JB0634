package com.Session21_Part2;

public class CharacterMethod_1 
{

	public static void main(String[] args) 
	{
		char c1 = 't';
		char c2 = '1';
		
		System.out.println(Character.isLetter(c1));
		System.out.println(Character.isLetter(c2));
		
		System.out.println("-----------------");
		
		System.out.println(Character.isDigit(c1));
		System.out.println(Character.isDigit(c2));
		
		System.out.println("-----------------");
		
		char c3 = 'T';
		
		System.out.println(Character.isUpperCase(c1));
		System.out.println(Character.isUpperCase(c3));
		
		System.out.println("-----------------");
		
		System.out.println(Character.isLowerCase(c1));
		System.out.println(Character.isLowerCase(c3));

	}

}
