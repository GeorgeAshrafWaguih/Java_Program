package decisionStructure;

import java.util.Scanner;

/*
 - If Else
 All Salespeople are expected to make at least 10 sales each week.
 For those who do , they receive a congratulatory message.
 For those who don't, they are informed of how many sales they were short.
 */
public class QuotaCalculator {

    public static void main(String args[]){

        // Initialize the values we know
        int targetQuota = 10;

        // Get unknown values
        System.out.println("Enter the number of sales you made this week: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfSales = scanner.nextInt();
        scanner.close();

        // Make a decision on the the path to take - output
        if (numberOfSales >= targetQuota)
            System.out.println("Congrats! You've met your quota");

        else {
            int salesShort = targetQuota - numberOfSales;
            System.out.println("You were "+ salesShort + " sales short");
        }
    }
}
