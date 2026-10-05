package skillbuilder;

import java.util.Scanner;

public class Delivery {
	public static void main(String[] args) {
	    try (Scanner scanner = new Scanner(System.in)) { 
	    	
	    	System.out.println("Enter the width integer "); 
            int width = scanner.nextInt(); 
            
            System.out.println("Enter the length integer: "); 
            int length = scanner.nextInt(); 
            
            System.out.println("Enter the height integer: "); 
            int height = scanner.nextInt(); 
            
            
            if (width <= 10 && length <= 10 && height <= 10) {
                System.out.println("Accept");
            }else {
                System.out.println("Reject");
            
           
            }
        }
	}
}
