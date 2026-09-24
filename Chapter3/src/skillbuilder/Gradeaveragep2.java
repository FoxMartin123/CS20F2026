package skillbuilder;

import java.util.Scanner;

public class Gradeaveragep2 {
    public static void main(String[] args) {
    	// create scanner object
        try (Scanner scanner = new Scanner(System.in)) {
			double totalSum = 0;
			int gradeCount = 0;
			
			// Prompt user if they are finished
			System.out.println("Enter grades (or type -1 to finish):");
			
			while (true) {
			    System.out.print("Enter grade: ");
			    double grade = scanner.nextDouble();
			    
			    if (grade == -1) {
			        break;
			    }
			    
			    // Short hand operator to accumulate grades
			    totalSum += grade;
			    gradeCount++;
			}
			
			if (gradeCount > 0) {
			    double average = totalSum / gradeCount;
			    
			    // Standard string concatenation instead of %.2f%%
			    System.out.println("Grade Average: " + average + "%");
			} else {
			    System.out.println("No grades were entered.");
			}
		}
        
       
    }
}
