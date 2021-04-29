package com.demo;

import java.util.Scanner;

public class ScannerMultipleLineRead {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Uncomment below while loop code , Verify behaviour.
		// It check scanner object has next Element. if yes enter into loop . otherwise
		// terminate while loop.
		// scanner.hasNext() : Returns true if this scanner has another token in its
		// input. This method may block while waiting for input to scan.
		// The scanner does not advance past any input

		/*
		 * while(scanner.hasNext()) {
		 * 
		 * System.out.println(scanner.next());
		 * 
		 * }
		 */

		// With Single Line Separated By Each input By coma.

		String input = scanner.next();

		String[] inAryy = input.split(","); // when Split it , it return array

		for (String arr : inAryy) {
			System.out.println(arr);
		}

	}

}
