package Mastery;

import java.util.Scanner;

public class DigitSumCalculator {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
			int number;

     
			while (true) {
			    System.out.print("Please enter a non-negative integer: ");
			    number = scanner.nextInt();
			    
			   
			    if (number >= 0) {
			        break; 
			    }
			    System.out.println("Invalid input. The number cannot be negative.");
			}

			int originalNumber = number;
			int sum = 0;

			
			if (number == 0) {
			    sum = 0;
			} else {
			   
			    while (number > 0) {
			        int digit = number % 10; 
			        sum += digit;            
			        number = number / 10;    
			    }
			}

			
			System.out.println("The sum of the digits in " + originalNumber + " is: " + sum);
		}
        
        
    }
}
