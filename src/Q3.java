
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
    public static void factors(int number) {
        // Loop to divide number
        for (int x = 1; x < (number + 1); x++) {
            // Divide number by x
            int remainder = number % x;
            // If number divides evenly by x, output it
            if (remainder == 0) {
                System.out.print(x + "  ");
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create scanner for user input
        Scanner input = new Scanner(System.in);
        // Ask user to enter a number
        System.out.println("Enter a number:");
        // Store user's number
        int number = input.nextInt();

        // Tell users what numbers mean
        System.out.println("The factors of " + number + " are:");
        // Output factor list using method
        factors(number);
    }
}
