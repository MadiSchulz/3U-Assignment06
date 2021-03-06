
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
    public static int firstDigit(int integer) {
        // If integer is negative
        if (integer < 0) {
            // Make it positive
            integer = integer * (-1);
        }
        // If the integer is not a single digit
        if (integer > 9) {
            do {
                // Remove the last digit from the integer
                integer = integer / 10;
                // Repeat until integer is a single digit
            } while (integer > 9);
        }
        // If the integer is a single digit (<=9), it must be the first digit, so...
        // Return first digit
        return integer;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Test method
        int lastDigit = firstDigit(3572);
        System.out.println(lastDigit);

        int lastDigit2 = firstDigit(-947);
        System.out.println(lastDigit2);
    }
}
