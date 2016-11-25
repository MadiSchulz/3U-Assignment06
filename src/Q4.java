
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
    public static double compoundInterest(double P, double r, int n) {
        // Calculate compound interest
        double B = P(1 + r) ^ n;
         = principal * Math.pow(1.0 + rate, years);
        // Return answer to user
        return B;
        // 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create scanner for user input
        Scanner input = new Scanner(System.in);
        // Ask user to input the compound interest
        System.out.println("Please input the compound interest:");
        // Store the compound interest


    }
}
