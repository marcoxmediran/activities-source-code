/*
 * Marcox C. Mediran
 * BSCS2_1
 * Object Oriented Programming
*/

package mmediran.oop.lesson03;

import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Activity1 {
	// DOS + GUI program
	public static void main(String[] args) throws IOException {
		// declare variables
		Scanner scanner = new Scanner(System.in);
		String name, course;
		Float quiz1_grade, quiz2_grade, quiz_average;
		Float recitation1_grade, recitation2_grade, recitation_average;
		Float project1_grade, project2_grade, project_average;
		Float exam_rating;
		Float class_standing, midterm_grade;

		// take input
		System.out.print("Enter student's name: ");
		name = scanner.nextLine();
		System.out.print("Enter student's course: ");
		course = scanner.nextLine();
		
		// class standing inputs
		System.out.println("For the following prompts, please input grades on a scale of 0-30, with 30 as highest");
		System.out.print("Enter grade for quiz1: ");
		quiz1_grade = scanner.nextFloat();
		System.out.print("Enter grade for quiz2: ");
		quiz2_grade = scanner.nextFloat();
		System.out.print("Enter grade for recitation1: ");
		recitation1_grade = scanner.nextFloat();
		System.out.print("Enter grade for recitation2: ");
		recitation2_grade = scanner.nextFloat();
		System.out.print("Enter grade for project1: ");
		project1_grade = scanner.nextFloat();
		System.out.print("Enter grade for project2: ");
		project2_grade = scanner.nextFloat();

		// exam rating input
		System.out.println("For the last prompt, please input the exam rating on a scale of 0-40, with 40 as highest");
		System.out.print("Enter grade for the exam: ");
		exam_rating = scanner.nextFloat();

		// calculate averages
		quiz_average = (quiz1_grade + quiz2_grade) / 2;	
		recitation_average = (recitation1_grade + recitation2_grade) / 2;
		project_average = (project1_grade + project2_grade) / 2;

		// calculate grades
		class_standing = (quiz_average + recitation_average + project_average) / 3;
		midterm_grade = (class_standing * 2) + exam_rating;

		// show result
		JOptionPane.showMessageDialog(null, String.format("The student %s from %s has a midterm grade of %.2f", name, course, midterm_grade), "Midterm Grade", 1);

		// program ran successfully
		scanner.close();
		System.exit(0);
	}
}
