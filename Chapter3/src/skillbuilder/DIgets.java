package skillbuilder;

import java.util.Scanner;

public class DIgets {

    public static void main(String[] args) {
    	//Create Scanner Object
        try (Scanner scanner = new Scanner(System.in)) 
        {
			
        	System.out.print("Enter a two-digit number: ");
			int number = scanner.nextInt();

			int tensPlace = number / 10;
			int onesPlace = number % 10;

			System.out.println("Tens place: " + tensPlace);
			System.out.println("Ones place: " + onesPlace);
		}

        
    }
}