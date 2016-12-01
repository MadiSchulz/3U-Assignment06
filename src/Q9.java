
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
public class Q9 {

    // Create function-type method
    public static boolean allDigitsOdd(int integer) {
        
    // Calculate the remainder of the integer
        int remainder = integer % 10;
        // If remainder is 0
        if (remainder == 0) {
            // Even number; not all digits are odd
            return false;
        // If remainder is not 0
        } else {
            // All digits are odd
            return true;
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
        
        allDigitsOdd(integer);

    }
}
