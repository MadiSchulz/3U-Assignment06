
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author schum0689
 */
public class Q5 {

    // Create procedure-type method
    public static void chaotic(int number) {
        // Generate pattern using number as the # of lines
        for (int l = 0; l < number; l++) {
            // Generate one line with a random # of asterisks
            int line = (int) (Math.random() * (5 - 1 + 1)) + 1;
            // 
            // Output line
            System.out.println();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create scanner for user input
        Scanner input = new Scanner(System.in);
        // Ask user to input a number
        System.out.println("Enter a number:");
        // Store user's number
        int number = input.nextInt();

        // Generate pattern with user's number of lines
        chaotic(number);
    }
}
