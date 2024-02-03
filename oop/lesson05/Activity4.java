/*
 * Marcox C. Mediran
 * BSCS2_1
 * Object Oriented Programming
*/

package mmediran.oop.lesson05;

import java.util.ArrayList;
import java.util.Scanner;

public class Activity4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Note: The problem might be a little repetitive so I will be
        // using methods to resolve it's repetitiveness

        // main loop
        for (String choice = "Y"; choice.equals("Y");) {
            // print menu
            System.out.println("[P] Prelim");
            System.out.println("[M] Midterm");
            System.out.println("[F] Final");
            System.out.println("[E] Exit");
            
            System.out.print("Enter your choice: ");
            String menuChoice = scanner.nextLine();

            switch (menuChoice) {
                case "P":
                    ArrayList<Double> prelimGrades = computeGrade(getGrades(scanner, "Prelim"), null);
                    printReport(prelimGrades, "Prelim");
                    System.out.println(printGrade(prelimGrades.get(3)));
                    break;
                case "M":
                    ArrayList<Double> midtermPrelimGrades = computeGrade(getGrades(scanner, "Prelim"), null);
                    ArrayList<Double> midtermGrades = computeGrade(getGrades(scanner, "Midterm"), midtermPrelimGrades);
                    printReport(midtermGrades, "Midterm");
                    System.out.println(printGrade(midtermGrades.get(3)));
                    break;
                case "F":
                    ArrayList<Double> finalPrelimGrades = computeGrade(getGrades(scanner, "Prelim"), null);
                    ArrayList<Double> finalMidtermGrades = computeGrade(getGrades(scanner, "Midterm"), finalPrelimGrades);
                    ArrayList<Double> finalGrades = computeGrade(getGrades(scanner, "Finals"), finalMidtermGrades);
                    printReport(finalGrades, "Finals");
                    System.out.println(printGrade(finalGrades.get(3)));
                    break;
                case "E":
                    System.out.println("\nGoodbye!!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

            // final question
            do {
                System.out.print("Do you want to try again? Y/N: ");
                choice = scanner.nextLine();
            } while (!choice.equals("Y") && !choice.equals("N"));
        }

        scanner.close();
    }

    // takes grades for any part of the academic year
    public static ArrayList<Integer> getGrades(Scanner s, String part) {
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.printf("Please enter grade for %s quiz: ", part);
        numbers.add(Integer.valueOf(s.nextLine()));
        System.out.printf("Please enter grade for %s recitation: ", part);
        numbers.add(Integer.valueOf(s.nextLine()));
        System.out.printf("Please enter grade for %s project: ", part);
        numbers.add(Integer.valueOf(s.nextLine()));
        System.out.printf("Please enter grade for %s exam: ", part);
        numbers.add(Integer.valueOf(s.nextLine()));
        return numbers;
    }
    
    // calculates final grade for prelim, midterm, or finals
    public static ArrayList<Double> computeGrade(ArrayList<Integer> getGrades, ArrayList<Double> previousGrades) {
        ArrayList<Double> grades = new ArrayList<>();
        double classStanding = (getGrades.get(0) + getGrades.get(1)) / 2;
        double projectGrade = getGrades.get(2) * 0.40;
        double lectureGrade = ((2 * classStanding + getGrades.get(3)) / 3) * 0.60;
        double finalGrade = projectGrade + lectureGrade;

        // if calculating for midterm or finals grade,
        // there is an extra step for computing the finalGrade
        if (previousGrades != null) {
            finalGrade = (2 * finalGrade + previousGrades.get(3)) / 3;
        }

        grades.add(classStanding);
        grades.add(projectGrade);
        grades.add(lectureGrade);
        grades.add(finalGrade);
        return grades;
    }

    public static void printReport(ArrayList<Double> grades, String part) {
        System.out.printf("The %s Class Standing grade: %f\n", part, grades.get(0));
        System.out.printf("The %s Project grade is: %f\n", part, grades.get(1));
        System.out.printf("The %s Lecture grade is: %f\n", part, grades.get(2));
        System.out.printf("The %s Grade is: %f\n", part, grades.get(3));
    }

    public static String printGrade(Double givenGrade) {
        double grade = 0;
        if (givenGrade >= 97) {
            grade = 1.00;
        } else if (givenGrade >= 94) {
            grade = 1.25;
        } else if (givenGrade >= 91) {
            grade = 1.50;
        } else if (givenGrade >= 88) {
            grade = 1.75;
        } else if (givenGrade >= 85) {
            grade = 2.00;
        } else if (givenGrade >= 82) {
            grade = 2.25;
        } else if (givenGrade >= 79) {
            grade = 2.50;
        } else if (givenGrade >= 76) {
            grade = 2.75;
        } else if (givenGrade >= 75) {
            grade = 3.00;
        } else {
            grade = 5.00;
        }
        String message = "";
        if (grade <= 3.00) {
            message = String.format("Your equivalent grade is %.2f. You passed in this subject. Congratulations!!", grade);
        } else {
            message = String.format("Your equivalent grade is %.2f. You failed this subject. Study more!!", grade);
        }
        return message;
    }
    
}
