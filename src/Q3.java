
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author schum0689
 */
public class Q3 {

    // Create procedure-type method
    public static void factors(int integer) {
        // Loop to divide integer
        for (int x = 1; x < (integer + 1); x++) {
            // Divide integer by x
            int remainder = integer % x;
            // If integer divides evenly by x
            if (remainder == 0) {
                // Output x
                System.out.print(x + "  ");
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Test method
        factors(10);

        System.out.println();
        factors(30);
    }
}
