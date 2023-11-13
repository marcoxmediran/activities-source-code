/*
 * Marcox C. Mediran
 * BSCS2_1
 * Object Oriented Programming
*/

package mmediran.oop.lesson03;

import java.io.IOException;
import javax.swing.JOptionPane;

public class Activity3Gui {
	// GUI program
	public static void main(String[] args) throws IOException {
		// declare variables
		final String NAME = "Juan Dela Cruz";
		final int HOURS_PER_WEEK = 40;
		final Float RATE = 85.50f;
		Float gross_pay;
		String message;
		
		// calculate result
		gross_pay = RATE * HOURS_PER_WEEK;

		// print result
		message = String.format("%s's gross pay in a week is %.2f", NAME, gross_pay);
		JOptionPane.showMessageDialog(null, message, "Answer", JOptionPane.INFORMATION_MESSAGE);

		// program ran successfully
		System.exit(0);
	}
}
