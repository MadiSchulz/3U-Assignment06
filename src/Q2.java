
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author schum0689
 */
public class Q2 {

    // Create method
    public static void examGrade(int percent) {
        // If less than 50%,
        if (percent < 50) {
            // Grade is an F
            System.out.println("Letter grade = F");
            // If 50-59%,
        } else if (percent > 49 && percent < 60) {
            // Grade is a D
            System.out.println("Letter grade = D");
            // If 60-69%
        } else if (percent > 59 && percent < 70) {
            // Grade is a C
            System.out.println("Letter grade = C");
            // If 70-79%
        } else if (percent > 69 && percent < 80) {
            // Grade is a B
            System.out.println("Letter grade = B");
            // If above 80%
        } else if (percent > 79) {
            // Grade is an A
            System.out.println("Letter grade = A");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create scanner for user input
        Scanner input = new Scanner(System.in);
        // Ask user to input exam percentage
        System.out.println("Input the exam percentage:");
        // Store user's answer
        int percent = input.nextInt();

        // Output answer to user using method
        examGrade(percent);
    }
}
