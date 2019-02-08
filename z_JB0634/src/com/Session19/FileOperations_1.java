package com.Session19;

import java.io.File;

public class FileOperations_1 {

	public static void main(String[] args) throws InterruptedException {

		File f1 = new File("/Users/tajkumarkempaiah/Desktop/Session19/Tejkumar");
		// creating the folder
		f1.mkdir();

		// check if the folder is present or not
		boolean value = f1.exists();
		System.out.println("Value is: " + value);

		Thread.sleep(4000); // Milii seconds (4) -> 4000

		// delete the folder
		f1.delete();

	}

}
