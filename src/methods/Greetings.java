package methods;

import java.util.Scanner;

/*
First method
A method that asks the user for their name
Then greets them by name
 */
public class Greetings {
    public static void main(String args[]){

        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        greetUser(name);
    }

    public static void greetUser(String name){
        System.out.println("Hi "+ name+"!");
    }
}
