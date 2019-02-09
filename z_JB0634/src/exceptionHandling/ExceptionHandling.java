package exceptionHandling;

public class ExceptionHandling {
	public static void main(String[] args) {

		// Arithmetic Exception
		int a = 10;
		System.out.println("The value of a is: " + a);

		try {
			int b = 10 / 0;
			System.out.println("The value of b is : " + b);
		} catch (ArithmeticException ae) {
			System.out.println("Arithmetic Exception handled...");
		}

		int c = 20;
		System.out.println("The value of c is: " + c);

		// Null Pointer Exception
		String s1 = "Janbask";
		System.out.println("Length of String s1 is: " + s1.length());

		try {
			String s2 = null;
			System.out.println("Length of String s2 is: " + s2.length());
		} catch (NullPointerException npe) {
			System.out.println("NullPointerException handled...");
		}

		// Number Format Exception
		// String a1 = "abc";

		// int value = Integer.parseInt(a1);

		// System.out.println("Value = " + value);

		// ArrayIndexOutofBoundException
		int[] i_array = { 1, 2, 3, 4 }; // size = 4
		System.out.println(i_array[0]);
		System.out.println(i_array[1]);
		System.out.println(i_array[2]);
		System.out.println(i_array[3]);
		System.out.println(i_array[4]);
	}
}
