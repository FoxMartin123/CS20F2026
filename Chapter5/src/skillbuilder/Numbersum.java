package skillbuilder;

import java.util.Scanner;

public class Numbersum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a positive integer: ");
        
        if (scanner.hasNextInt()) {
            int userInput = scanner.nextInt();

            if (userInput < 1) {
                System.out.println("Please enter a number greater than or equal to 1.");
            } else {
                int totalSum = 0;
                System.out.println("\nNumbers from 1 to entered number:");

               
                for (int i = 1; i <= userInput; i++) {
                    System.out.println(i);
                    totalSum += i; 
                }

               
             
                System.out.println("Total Sum: " + totalSum);
            }
        } else {
            System.out.println("Invalid input! Please enter a valid integer.");
        }

        scanner.close();
    }
}
