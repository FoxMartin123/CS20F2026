package skillbuilder;

import java.util.Scanner;

public class TimeConverter {

    public static double hoursToMinutes(double hours) {
        return hours * 60;
    }

    public static double daysToHours(double days) {
        return days * 24;
    }

    public static double hoursToDays(double hours) {
        return hours / 24;
    }
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			boolean keepRunning = true;
			
			while (keepRunning) {
			    
			    System.out.println("1. Convert Hours to Minutes");
			    System.out.println("2. Convert Days to Hours");
			    System.out.println("3. Convert Hours to Days");
			    System.out.println("4. Exit");
			    System.out.print("Enter your choice (1-4): ");

			    if (!scanner.hasNextInt()) {
			        System.out.println("Invalid input. Please enter a number between 1 and 4.");
			        scanner.next(); 
			        continue;
			    }

			    int choice = scanner.nextInt();

			    if (choice == 4) {
			        System.out.println("Exiting");
			        break;
			    }

			    double inputVal = 0;
			    double result = 0;

			    switch (choice) {
			        case 1:
			            System.out.print("Enter hours: ");
			            inputVal = scanner.nextDouble();
			            result = hoursToMinutes(inputVal);
			            System.out.println(inputVal + " hours = " + result + " minutes.");
			            break;
			        case 2:
			            System.out.print("Enter days: ");
			            inputVal = scanner.nextDouble();
			            result = daysToHours(inputVal);
			            System.out.println(inputVal + " days = " + result + " hours.");
			            break;
			        case 3:
			            System.out.print("Enter hours: ");
			            inputVal = scanner.nextDouble();
			            result = hoursToDays(inputVal);
			            System.out.println(inputVal + " hours = " + result + " days.");
			            break;
			        default:
			            System.out.println("Invalid choice. Please select 1, 2, 3, or 4.");
			    }
			}
		}

    }
}
