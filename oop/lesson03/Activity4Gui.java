/*
 * Marcox C. Mediran
 * BSCS2_1
 * Object Oriented Programming
*/

package mmediran.oop.lesson03;

import java.io.IOException;
import javax.swing.JOptionPane;

public class Activity4Gui {
	// GUI program
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
		String message0 = String.format("%s made a time deposit of Php%d with a 12%% interest rate for a term of 30 days.", NAME, PRINCIPAL);
		String message1 = String.format("The time deposit has a withholding tax of 10%%.");
		String message2 = String.format("After the specified terms, the time deposit had an interest of Php%.2f and a withholding tax of %.2f", raw_interest, withholding_tax);
		String message3 = String.format("Lastly, the time deposit gained a net interest of Php%.2f", net_interest);
		JOptionPane.showMessageDialog(null, String.format("%s\n\n%s\n\n%s\n\n%s\n", message0, message1, message2, message3), "Result", JOptionPane.INFORMATION_MESSAGE);

		// program ran successfully
		System.exit(0);
	}
}
