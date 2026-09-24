package skillbuilder;

import java.util.Scanner;

public class GradeAverage {

    public static void main(String[] args) {
        // Create scanner object
        try (Scanner scanner = new Scanner(System.in)) {
			//Ask first grade
			System.out.print("Enter grade 1: ");
			double grade1 = scanner.nextDouble();
			
			//Ask second grade
			System.out.print("Enter grade 2: ");
			double grade2 = scanner.nextDouble();
			
			//Ask for third grade
			System.out.print("Enter grade 3: ");
			double grade3 = scanner.nextDouble();
			
			//Ask for forth grade
			System.out.print("Enter grade 4: ");
			double grade4 = scanner.nextDouble();
			
			//Ask for fifth grade
			System.out.print("Enter grade 5: ");
			double grade5 = scanner.nextDouble();
			
			//Calculate average
			double average = (grade1 + grade2 + grade3 + grade4 + grade5) / 5;
			
			//output average
			System.out.println("Your average is: " + average);
		}

        
    }
}