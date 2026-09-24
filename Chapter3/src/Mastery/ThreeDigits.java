package Mastery;

import java.util.Scanner; 

public class ThreeDigits { 
    public static void main(String[] args) { 
        // Create Scanner Object
        try (Scanner scanner = new Scanner(System.in)) { 
            System.out.println("Enter a three-digit number: "); 
            int number = scanner.nextInt(); 
            
            // Extracting digits correctly
            int hundredsPlace = number / 100;
            int tensPlace = (number / 10) % 10; 
            int onesPlace = number % 10; 
            
            // Printing results
            System.out.println("Hundreds place: " + hundredsPlace);
            System.out.println("Tens place: " + tensPlace); 
            System.out.println("Ones place: " + onesPlace);
        	
        } 
    } 
}

 