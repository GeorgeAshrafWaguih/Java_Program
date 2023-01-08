package repitionStructure;

import java.util.Scanner;

/*
Do While loop:
A program that allows the user to enter two numbers and sums them up
The user should be able to repeat this action until he decides not to.
 */
public class AddNumbers {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        boolean again = false;
        do {
            System.out.println("Enter the first number: ");
            double number1 = scanner.nextDouble();

            System.out.println("Enter the second number: ");
            double number2 = scanner.nextDouble();

            double sum = number1 + number2;
            System.out.println("The sum is "+ sum);

            System.out.println("Do you want to try again? (true/false)");
            again = scanner.nextBoolean();
        } while (again);
    }
}
