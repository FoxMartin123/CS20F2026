package skillbuilder;

import java.util.Scanner;
public class Perfectsquare {
	   public static void main(String[] args)

	   {
	       try (Scanner scr = new Scanner(System.in)) {
			System.out.print("Enter a number: ");

			   int number = scr.nextInt();  

			   double root = Math.sqrt(number); 

			   if(root == (int)root)

			   {
			       System.out.println(number+" is a Perfect Square.");
			   }

			   else

			   {
			       System.out.println(number+" is Not a Perfect Square.");
			   }
		   }

	   }

	}