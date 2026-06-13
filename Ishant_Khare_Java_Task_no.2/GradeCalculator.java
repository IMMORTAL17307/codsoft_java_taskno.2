package Task2_GradeCalculator;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=========================================");
        System.out.println("       STUDENT GRADE CALCULATOR          ");
        System.out.println("=========================================");
        
        int numSubjects = 0;
        while (true) {
            System.out.print("Enter the number of subjects: ");
            if (scanner.hasNextInt()) {
                numSubjects = scanner.nextInt();
                if (numSubjects > 0) {
                    break;
                }
            } else {
                scanner.next();
            }
            System.out.println("Please enter a valid number of subjects (greater than 0).");
        }
        
        double[] marks = new double[numSubjects];
        double totalMarks = 0;
        
        for (int i = 0; i < numSubjects; i++) {
            while (true) {
                System.out.print("Enter marks obtained in Subject " + (i + 1) + " (out of 100): ");
                if (scanner.hasNextDouble()) {
                    double subjectMarks = scanner.nextDouble();
                    if (subjectMarks >= 0 && subjectMarks <= 100) {
                        marks[i] = subjectMarks;
                        totalMarks += subjectMarks;
                        break;
                    }
                } else {
                    scanner.next();
                }
                System.out.println("Invalid input. Marks must be a number between 0 and 100.");
            }
        }
        
        double averagePercentage = totalMarks / numSubjects;
        
        String grade;
        if (averagePercentage >= 90) {
            grade = "A+ (Outstanding)";
        } else if (averagePercentage >= 80) {
            grade = "A (Excellent)";
        } else if (averagePercentage >= 70) {
            grade = "B (Very Good)";
        } else if (averagePercentage >= 60) {
            grade = "C (Good)";
        } else if (averagePercentage >= 50) {
            grade = "D (Pass)";
        } else {
            grade = "F (Fail)";
        }
        
        System.out.println("\n=========================================");
        System.out.println("                RESULTS                  ");
        System.out.println("=========================================");
        System.out.println("Total Subjects: " + numSubjects);
        System.out.printf("Total Marks Obtained: %.2f / %d\n", totalMarks, numSubjects * 100);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Corresponding Grade: " + grade);
        System.out.println("=========================================");
        
        scanner.close();
    }
}
