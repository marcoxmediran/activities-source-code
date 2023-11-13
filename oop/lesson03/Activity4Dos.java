/*
 * Marcox C. Mediran
 * BSCS2_1
 * Object Oriented Programming
*/

package mmediran.oop.lesson03;

import java.io.IOException;

public class Activity4Dos {
	// DOS program
	public static void main(String[] args) throws IOException {
		// declare variables
		final String NAME = "Maria";
		final int PRINCIPAL = 30000;
		final int DAYS_IN_YEAR = 365;
		final Float TIME = 30f / DAYS_IN_YEAR;
		final Float INTEREST_RATE = 0.12f;
		final Float TAX_RATE = 0.10f;
		Float withholding_tax;
		Float raw_interest;
		Float net_interest;

		// calculate result
		raw_interest = PRINCIPAL * INTEREST_RATE * TIME;
		withholding_tax = raw_interest * TAX_RATE;
		net_interest = raw_interest - withholding_tax;

		// show result
		System.out.printf("%s made a time deposit of Php%d with a 12%% interest rate for a term of 30 days.\n", NAME, PRINCIPAL);
		System.out.printf("The time deposit has a withholding tax of 10%%.\n");
		System.out.printf("After the specified terms, the time deposit had an interest of Php%.2f and a withholding tax of %.2f\n", raw_interest, withholding_tax);
		System.out.printf("Lastly, the time deposit gained a net interest of Php%.2f\n", net_interest);

		// program ran successfully
		System.exit(0);
	}
}
