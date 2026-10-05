package Mastery;

import java.util.Scanner;

public class gradesMastery {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) { 
            System.out.print("Enter your percentage: "); 
            int grade = scanner.nextInt(); 
            
            if (grade >= 90 && grade <= 100) {
                System.out.println("Your grade is an A"); 
            } else if (grade >= 80) {
                System.out.println("Your grade is a B"); 
            } else if (grade >= 70) {
                System.out.println("Your grade is a C");
            } else if (grade >= 60) {
                System.out.println("Your grade is a D"); 
            } else {
                System.out.println("Your grade is an F"); 
            }
 
	    }
	}
}
