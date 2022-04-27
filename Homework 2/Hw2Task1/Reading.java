//-----------------------------------------------------
// Title: Reading class
// Author: Yakugpguly/Malikov
// Section: 1
// Assignment: 2
// Description: This class reads values in the file
//-----------------------------------------------------

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reading {

	// Scans the file and returns Scanner
	static Scanner scanFile(File file) {
		try {
			return new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println(e);
			return null;
		}
	}

	// reads integers from file and returns integer array
	static int[] readInteger(String fileName) {

		File file = new File(fileName);
		Scanner scan = scanFile(file);
		int size = scan.nextInt();

		int[] arr = new int[size];

		int i = 0;

		while (scan.hasNext()) {
			arr[i] = scan.nextInt();
			i++;
		}
		return arr;
	}

	// read double from file and returns double array
	static double[] readDouble(String fileName) {

		File file = new File(fileName);
		Scanner scan = scanFile(file);
		int size = scan.nextInt();

		double[] arr = new double[size];

		int i = 0;
		while (scan.hasNext()) {
			arr[i] = scan.nextDouble();
			i++;
		}
		return arr;
	}
}
