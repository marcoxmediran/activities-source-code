/*
 * Marcox C. Mediran
 * BSCS2_1
 * Object Oriented Programming
*/

package mmediran.oop.lesson03;

import java.io.IOException;

public class Activity3Dos {
	// DOS program
	public static void main(String[] args) throws IOException {
		// declare variables
		final String NAME = "Juan Dela Cruz";
		final int HOURS_PER_WEEK = 40;
		final Float RATE = 85.50f;
		Float gross_pay;
		
		// calculate result
		gross_pay = RATE * HOURS_PER_WEEK;

		// print result
		System.out.printf("%s's gross pay in a week is %.2f\n", NAME, gross_pay);

		// program ran successfully
		System.exit(0);
	}
}
