package Mastery;

import java.util.Scanner;

public class Pizza {
	
	    public static void main(String[] args) {
	        float labor = 0.75f;
	        int rent = 1;
            //create scanner object
	        try (Scanner scanner = new Scanner(System.in)) {
	            System.out.print("Enter the diameter of the pizza in inches: ");
	            
	            if (scanner.hasNextDouble()) {
	                double diameter = scanner.nextDouble();
	                
	                // Material cost and total cost formula
	                double materials = 0.05 * diameter * diameter;
	                double totalCost = labor + rent + materials;

	                // Output the total 
	                System.out.printf("The cost of making the pizza is: " + totalCost);
	            } else 
	                System.out.println("Invalid input. Please enter a valid numeric diameter.");
	            }
	        }
	    }
	
