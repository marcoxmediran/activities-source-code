/*
 * Marcox C. Mediran
 * BSCS2_1
 * Object Oriented Programming
*/

package mmediran.oop.lesson03;

import java.io.IOException;
import java.util.Scanner;

public class Activity1Dos {
	// DOS program
	public static void main(String[] args) throws IOException {
		// declare variables
		Scanner scanner = new Scanner(System.in);
		String name, course;
		Float quiz1_grade, quiz2_grade, quiz_average;
		Float recitation1_grade, recitation2_grade, recitation_average;
		Float project1_grade, project2_grade, project_average;
		Float exam_rating;
		Float class_standing, prelim_grade;

		// take input
		System.out.print("Enter student's name: ");
		name = scanner.nextLine();
		System.out.print("Enter student's course: ");
		course = scanner.nextLine();
		
		// class standing inputs
		System.out.println("For the following prompts, please input grades on a scale of 0-100, with 100 as highest");
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
		System.out.print("Enter grade for the exam: ");
		exam_rating = scanner.nextFloat();

		// calculate averages
		quiz_average = (quiz1_grade + quiz2_grade) / 2;	
		recitation_average = (recitation1_grade + recitation2_grade) / 2;
		project_average = (project1_grade + project2_grade) / 2;

		// calculate grades
		class_standing = (quiz_average + recitation_average + project_average) / 3;
		prelim_grade = ((class_standing * 2) + exam_rating) / 3;

		// show result
		System.out.printf("The student %s from %s has a prelim grade of %.2f\n", name, course, prelim_grade);

		// program ran successfully
		scanner.close();
		System.exit(0);
	}
}
