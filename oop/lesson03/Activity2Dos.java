/*
 * Marcox C. Mediran
 * BSCS2_1
 * Object Oriented Programming
*/

package mmediran.oop.lesson03;

import java.io.IOException;
import java.util.Scanner;

public class Activity2Dos {
	// DOS program
	public static void main(String[] args) throws IOException {
		// declare variables
		Scanner scanner = new Scanner(System.in);
		final Float RATE = 50.50f;
		Float usd, peso;
		

		// take input and calculate answer
		System.out.print("Input you cash in US Dollars: ");
		usd = scanner.nextFloat();
		peso = usd * RATE;

		// show answer
		System.out.printf("%.2f is equal to %.2f\n", usd, peso);

		// program ran successfully
		scanner.close();
		System.exit(0);
	}
}
