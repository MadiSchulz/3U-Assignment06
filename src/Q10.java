
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
public class Q10 {

    // Create boolean method
    public static boolean sameDashes(String one, String two) {
        
        // Check if there are dashes in string one
        int dashPosition1 = one.indexOf("-");
        // Check if there are dashes in string two
        int dashPosition2 = two.indexOf("-");

        // If both strings have dashes
        if (dashPosition1 != -1 && dashPosition2 != -1) {

            // Go through string one
            for (int i = 0; i < one.length(); i++) {
                // For every dash found
                //if (one.charAt(i) == '-') {
                    // Variable to store the string of dash positions 
                    //int dashPositions1 = i;
                    //System.out.println(i);
                     
                //}
            }
        }

        // If only one string has dashes
        if ((dashPosition1 != -1 && dashPosition2 == -1) || (dashPosition1 == -1 && dashPosition2 != -1)) {}

        // If neither string has dashes
        if (dashPosition1 == -1 && dashPosition2 == -1) {}

        return;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create scanner for user input
        Scanner input = new Scanner(System.in);

        // Ask user for first string
        System.out.println("Enter string 1:");
        // Store string 1
        String one = input.nextLine();

        // Ask user for second string
        System.out.println("Enter string 2:");
        // Store string 2
        String two = input.nextLine();

        sameDashes(one, two);
    }
}
