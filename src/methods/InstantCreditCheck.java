package methods;

import java.util.Scanner;

/*
Variable scope:
Instant credit check program that approves anyone who makes more than $25,000 and has credit score of 700 or more,
Rejects others
 */
public class InstantCreditCheck {

    // Initialize the known
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

        // Get the unknown
        double userSalary = getSalary();
        int userCreditScore = getCreditScore();
        scanner.close();

        // Check if user is qualified
        boolean qualified = isUserQualified(userSalary,userCreditScore);

        // Notify the user
        notifyUser(qualified);
    }

    public static double getSalary(){
        System.out.println("Enter you salary: ");
        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getCreditScore(){
        System.out.println("Enter your credit score: ");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isUserQualified(double salary , int creditScore){
        if (creditScore >= requiredCreditScore && salary >= requiredSalary){
            return true;
        }
        else {
            return false;
        }

    }

    public static void notifyUser(boolean isQualified){
        if (isQualified){
            System.out.println("Congrats! You've been approved");
        }else {
            System.out.println("Sorry, you've been declined!");
        }
    }
}
