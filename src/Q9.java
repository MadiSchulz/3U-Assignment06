
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

    // Create method
    public static boolean allDigitsOdd(int integer) {

        // Variable to store odd # count
        int countOdd = 0;
        // Variable to store even # count
        int countEven = 0;

        // Loop while the integer is a positive number
        while (integer >= 1) {

            // Divide integer into groups of two
            int remainder = integer % 2;

            // If the remainder is 0 (even)
            if (remainder == 0) {
                // Count as even #
                countEven++;
            }
            // If remainder is 1 (odd)
            if (remainder == 1) {
                // Count as odd #
                countOdd++;
            }
            // Remove the last digit from the integer
            integer = integer / 10;
        }
        // Return true if no even #s are counted
        return countEven == 0;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Test method
        System.out.println(allDigitsOdd(135319));
        System.out.println(allDigitsOdd(9145293));
    }
}
