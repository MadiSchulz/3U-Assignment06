
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author schum0689
 */
public class Q1 {

    // Create function-type method
    public static double circleArea(double radius) {
        // Calculate area
        double area = 3.14 * (Math.pow(radius, 2));
        // Return answer to user
        return area;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create scanner for user input
        Scanner input = new Scanner(System.in);
        // Ask user to input a radius value
        System.out.println("Input a radius value:");
        // Store user's radius value
        double radius = input.nextDouble();

        // Calculate area of circle using method
        double area = circleArea(radius);

        // Output answer to user
        System.out.println("The circle's area is " + area);
    }
}
