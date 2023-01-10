package arrays;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH=6; // All caps + final to state that this will never change
    public static final int MAX_TICKET_NUMBER=69;

    public static void main(String[] args) {
        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    public static int[] generateNumbers(){

        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for (int i=0; i<LENGTH; i++){
            int randomNumber;
            //Generate random number then search if it exists in the array to generate a new number
            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1; // to generate numbers starting from 1 to 70
            }while (search(ticket, randomNumber));

            ticket[i]= randomNumber; //Number is unique and added to the array

        }
        return ticket;
    }

    /**
     * Does a sequential search on the array to find a value
     * @param array Array to search through
     * @param numberToSearchFor Value to search for
     * @return True if found, false if not
     */
    public static boolean search(int[] array, int numberToSearchFor){

        // Enhanced loop to iterate through an array and each time assigns the current element to 'value'
        for (int value : array){
            if (value == numberToSearchFor){
                return true;
            }
        }

        return false; // At this point the entire array was searched and the value was not found
    }

    public static boolean binarySearch(int[] array, int numberToSearch){

        // Array must be sorted first
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, numberToSearch);
        if (index>=0){
            return true;
        }
        else return false;
    }

    public static void printTicket(int ticket[]){
        for (int i=0;i<LENGTH;i++){
            System.out.print(ticket[i]+ " | ");
        }
    }
}
