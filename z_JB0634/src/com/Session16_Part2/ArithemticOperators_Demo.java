package com.Session16_Part2;

public class ArithemticOperators_Demo 
{
	public static void main(String[] args) 
	{
		//Arithematic Operators in Java
		
		int a = 20;
		int b = 10;
		int c = 5;
		int d = 9;
		
		int result_addition; 
		int result_substraction;
		int result_division;  //Quotient
		int result_multiplication;
		int result_modular_division;  //Remainder
		int result_increment_operator;
		int result_decrement_operator;
		
		
		//Addition
		result_addition = a+b;     //30
		result_substraction = a-b; //10
		result_division = a/b;     //2
		result_multiplication = a*b;  //200
		result_modular_division = a%b;  //0
		result_increment_operator = ++c; //5 -> 5+1 -> 6 (Memory)
		result_decrement_operator = --d; //9 -> 9-1 -> 8 (Memory) 
		
		//print out the results
		System.out.println(result_addition);
		System.out.println(result_substraction);
		System.out.println(result_division);
		System.out.println(result_multiplication);
		System.out.println(result_modular_division);
		System.out.println(result_increment_operator);
		System.out.println(result_decrement_operator);
	}
}
