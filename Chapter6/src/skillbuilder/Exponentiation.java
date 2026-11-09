package skillbuilder;

import java.util.Scanner;

public class Exponentiation {

    public static double powerOf(double num1, double num2) {
        return Math.pow(num1, num2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = input.nextDouble();

        double result = powerOf(firstNumber, secondNumber);

        System.out.println(firstNumber + " raised to the power of "
                + secondNumber + " is " + result);

        input.close();
    }
}
