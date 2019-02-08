package com.Session19;

import java.io.File;
import java.io.IOException;

public class FileOperations_2 {

	public static void main(String[] args) throws IOException, InterruptedException {

		File f2 = new File("/Users/tajkumarkempaiah/Desktop/Session19/Excel.xls");
		f2.createNewFile();

		Thread.sleep(4000);

		f2.delete();

	}

}
