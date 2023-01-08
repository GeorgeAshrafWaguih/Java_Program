package repitionStructure;

import java.util.Scanner;

/*
While loop
Each store employee makes $15 an hour,
write a program that allows the employee to enter the number of hours worked for the week.
Do not allow overtime
 */
public class GrossPayInputValidation {
    public static void main(String args[]){

        // Initialize known variables
        int ratePerHour = 15;
        int maxHours = 40;

        // Get unknown variables
        System.out.println("Enter the number of hours of work for this week: ");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //Validate input
        while (hoursWorked > maxHours || hoursWorked < 1){
            System.out.println("Your hours must be between 1 and 40, try again: ");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        // Calculate the gross
        double gross = ratePerHour * hoursWorked;
        System.out.println("Gross pay: $"+ gross);
    }
}
