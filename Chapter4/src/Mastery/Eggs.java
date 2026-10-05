package Mastery;

import java.util.Scanner;

public class Eggs{
    
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the total number of eggs purchased: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Error: Please enter a valid whole number of eggs.");
            return;
        }
        int totalEggs = scanner.nextInt();

        if (totalEggs < 0) {
            System.out.println("Error: Number of eggs cannot be negative.");
            return;
        }

     
        int dozens = totalEggs / 12;
        int extraEggs = totalEggs % 12;

       
        double pricePerDozen;
        if (dozens < 4) {
            pricePerDozen = 0.50;
        } else if (dozens < 6) {
            pricePerDozen = 0.45;
        } else if (dozens < 11) {
            pricePerDozen = 0.40;
        } else {
            pricePerDozen = 0.35;
        }

        
        double extraEggPrice = pricePerDozen / 12.0;
        double totalCost = (dozens * pricePerDozen) + (extraEggs * extraEggPrice);

       

        System.out.println("Total Eggs: " + totalEggs);
        System.out.printf("Total Cost: $%.2f%n", totalCost); 
        
        scanner.close();
        
    }
}
