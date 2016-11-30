
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author schum0689
 */
public class Q7 {

    // Create procedure-type method (only because of the while loop and issue with a return statement)
    public static void firstDigit(int integer) {
        // If integer is negative
        if (integer < 0) {
            // Make it positive
            integer = integer * (-1);
        }
        // While the integer is not a single digit
        while (integer > 9) {
            // Divide the integer by 10
            integer = integer / 10;
        }
        // If the integer is a single digit
        if (integer <= 9) {
            // The integer is the first digit
            System.out.println("The first digit is " + integer);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create scanner for user input
        Scanner input = new Scanner(System.in);
        // Ask user for an integer
        System.out.println("Please input an integer:");
        // Store user's integer
        int integer = input.nextInt();

        // Ouput the first digit
        firstDigit(integer);
    }
}
