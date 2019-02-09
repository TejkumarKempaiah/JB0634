package exceptionHandling;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter character....");
		char c_value = s1.next().charAt(0);

		System.out.println("Entered char value is: " + c_value);

	}

}
