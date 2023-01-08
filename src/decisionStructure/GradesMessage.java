package decisionStructure;

import java.util.Scanner;

public class GradesMessage {

    public static void main(String args[]){

        System.out.println("Enter your Grade: ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        String message;

        switch (grade){
            case "A":
                message = "Excellent job";
                break;
            case "B":
                message = "Great job";
                break;
            case "C":
                message = "Good job";
                break;
            case "D":
                message = "You need to work a bit harder";
                break;
            case "F":
                message = "Sorry you failed!";
                break;
            default:
                message = "Error invalid grade";
                break;
        }

        System.out.println(message);

    }
}
