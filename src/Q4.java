
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author schum0689
 */
public class Q4 {

    // Create function-type method
    public static double compoundInterest(double P, double r, double n) {
        // Calculate new balance
        double B = P * Math.pow((1 + r/100), n);
        // Return new balance to user
        return B;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create scanner for user input
        Scanner input = new Scanner(System.in);

        // Ask user to enter the principle balance
        System.out.println("Enter the intital principle amount:");
        double P = input.nextDouble();

        // Ask user for the interest rate
        System.out.println("Enter the interest rate:");
        double r = input.nextDouble();

        // Ask user for the number of years
        System.out.println("Enter the number of years:");
        double n = input.nextDouble();

        // Calculate new balance using method
        double newBalance = compoundInterest(P, r, n);
        
        // Output new balance
        System.out.println("New balance = " + newBalance);
    }
}
