package decisionStructure;

import java.util.Scanner;

/*
Logical operators
To qualify for a loan , a person must make at least $30,000
and have been working at their current job for at least 2 years
 */
public class LogicalOperatorLoanQualifier {
    public static void main(String args[]){

        // Initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        // Get what we don't know
        System.out.println("Enter your Salary: ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years at your current job: ");
        double years = scanner.nextDouble();
        scanner.close();

        // Make decision
        if(salary >= requiredSalary && years >= requiredYearsEmployed){
                System.out.println("Congrats! You qualify for the loan");
            
        }else {
            System.out.println("Sorry your salary needs to be at least $"+requiredSalary);
        }
    }
}
