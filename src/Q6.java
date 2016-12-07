
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
        // If integer is negative
        if (integer < 0) {
            // Make it positive
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

        // Test method
        int lastDigit = lastDigit(3572);
        System.out.println(lastDigit);

        int lastDigit2 = lastDigit(-947);
        System.out.println(lastDigit2);

    }
}
