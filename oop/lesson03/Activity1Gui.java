/*
 * Marcox C. Mediran
 * BSCS2_1
 * Object Oriented Programming
*/

package mmediran.oop.lesson03;

import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Activity1Gui {
	// GUI program
	public static void main(String[] args) throws IOException {
		// declare variables
		String name, course;
		int quiz1_grade, quiz2_grade, quiz_average;
		int recitation1_grade, recitation2_grade, recitation_average;
		int project1_grade, project2_grade, project_average;
		Float exam_rating;
		Float class_standing, prelim_grade;

		// take input
		name = JOptionPane.showInputDialog(null, "Enter student's name:");
		course = JOptionPane.showInputDialog(null, "Enter student's course");
		
		// class standing inputs
		JOptionPane.showMessageDialog(null, "For the following prompts, please input grades on a scale of 0 to 100, with 100 as the highest", "Attention!", JOptionPane.INFORMATION_MESSAGE);
		quiz1_grade = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter student's score for Quiz 1"));
		quiz2_grade = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter student's score for Quiz 2"));
		recitation1_grade = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter student's score for Recitation 1"));
		recitation2_grade = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter student's score for Recitation 2"));
		project1_grade = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter student's score for Project 1"));
		project2_grade = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter student's score for Project 2"));

		// exam rating input
		exam_rating = Float.parseFloat(JOptionPane.showInputDialog(null, "Enter studen'ts exam rating"));

		// calculate averages
		quiz_average = (quiz1_grade + quiz2_grade) / 2;	
		recitation_average = (recitation1_grade + recitation2_grade) / 2;
		project_average = (project1_grade + project2_grade) / 2;

		// calculate grades
		class_standing = (quiz_average + recitation_average + project_average) / 3f;
		prelim_grade = ((class_standing * 2) + exam_rating) / 3;

		// show result
		JOptionPane.showMessageDialog(null, String.format("The student %s from %s has a prelim grade of %.2f", name, course, prelim_grade), "Prelim Grade", JOptionPane.INFORMATION_MESSAGE);

		// program ran successfully
		System.exit(0);
	}
}
