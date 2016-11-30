
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

    // Create function-type method
    public static int firstDigit(int integer) {
        // If integer is negative
        if (integer < 0) {
            // Make it positive
            integer = integer * (-1);
        }
        
        // Isolate the first digit in integer
        int digit = integer / 10;
        
        // Return first digit
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
        int firstDigit = firstDigit(integer);

        // Output the last digit
        System.out.println("The first digit is " + firstDigit);
    }
}
