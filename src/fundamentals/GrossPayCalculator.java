package fundamentals;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String arg[]){

//        1. Get the number of hours worked
        System.out.print("Enter the number of hours the employee worked: ");
        Scanner scanner = new Scanner(System.in);
        int hoursWorked = scanner.nextInt();

//        2. Get the hourly rate
        System.out.print("Enter the hour rate: ");
        double hourlyRate = scanner.nextDouble();
        scanner.close();

//        3. Multiply hours and pay rate
        double grossPay = hourlyRate * hoursWorked;

//        4. Display result
        System.out.println("The Gross Pay is:  " + grossPay + "$");
    }
}
