package skillbuilder;


import java.util.Scanner; 

public class Oddsum {

    public static void main(String[] args) {
     
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a positive integer: ");
			int limit = scanner.nextInt();
			
			int sum = 0;
			
 
			for (int i = 1; i <= limit; i++) {
			   
			    if (i % 2 != 0) {
			        sum += i; 
			    }
			}
			

			System.out.println("The sum of odd numbers from 1 to " + limit + " is: " + sum);
		}
        
       
    } 
} 