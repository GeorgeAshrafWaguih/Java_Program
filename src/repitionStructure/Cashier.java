package repitionStructure;

import java.util.Scanner;

/*
For Loop:
A Cashier program that will scan a given number of items and tally the cost.
 */
public class Cashier {

    public static void main(String args[]){

        // Get number of items to scan
        System.out.println("Enter the number of items you would like to scan: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfItems = scanner.nextInt();


        double total = 0;

        // Create loop to iterate through all the items and accumulate the cost
        for (int i =0; i<numberOfItems; i++){
            System.out.println("enter the cost of the item: ");
            double price = scanner.nextDouble();
            total = total + price;
        }
        scanner.close();
        System.out.println("Your total is $"+total);
    }
}
