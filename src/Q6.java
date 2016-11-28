
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author madis
 */
public class Q6 {
// Create procedure-type method
    public static int lastDigit(int integer){
        // Pull integer apart
        int digit = integer % 10; 
        return digit;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create scanner for user input
        Scanner input = new Scanner(System.in);
        // Ask user for an ineger
        System.out.println("Please input an integer:");
        // Store user's integer
        int integer = input.nextInt();
        
        int lastDigit = lastDigit(integer);
        
        System.out.println(lastDigit);
        
    }
}
