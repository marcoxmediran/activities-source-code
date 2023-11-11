/*
 * Marcox C. Mediran
 * BSCS2_1
 * Object Oriented Programming
*/

package mmediran.oop.lesson03;

import java.io.IOException;
import javax.swing.JOptionPane;

public class Activity2 {
	// GUI program
	public static void main(String[] args) throws IOException {
		// declare variables
		final Float RATE = 50.50f;
		Float usd, peso;
		

		// take input and calculate answer
		usd = Float.parseFloat(JOptionPane.showInputDialog("Input your cash in US Dollars: "));
		peso = usd * RATE;

		// show answer
		JOptionPane.showMessageDialog(null, String.format("$%.2f is equal to P%.2f", usd, peso), "Conversion Result", 1);

		// program ran successfully
		System.exit(0);
	}
}
