package skillbuilder; 

import java.util.Scanner; 

public class randomNum { 
    public static void main(String[] args) { 
        try (Scanner scanner = new Scanner(System.in)) { 
            
        	System.out.print("Enter the minimum integer: "); 
            int min = scanner.nextInt(); 
            
            System.out.print("Enter the max integer: "); 
            int max = scanner.nextInt(); 
       
            int randomNum = (int)(Math.random() * (max - min + 1)) + min;
            
            System.out.println("your number is: " + randomNum);
        } 
    } 
}
