
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
public class Q6 {

    // Create function-type method
    public static int lastDigit(int integer) {
        // If negative integer, make it positive
        if (integer < 0) {
            integer = integer * (-1);
        }
        // Isolate the last digit in integer
        int digit = integer % 10;
        // Return last digit
        return digit;
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

        // Find last digit using method
        int lastDigit = lastDigit(integer);

        // Output the last digit
        System.out.println("The last digit is " + lastDigit);

    }
}
