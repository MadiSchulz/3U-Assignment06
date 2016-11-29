
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author schum0689
 */
public class Q8 {

    // Create procedure-type method
    public static void season(int day, int month) {
        // If January or February
        if (month == 1 || month == 2) {
            System.out.println("Winter");
        }
        // If March
        if (month == 3) {
            // If day 1-15
            if (day >= 1 && day <= 15) {
                System.out.println("Winter");
            }
            // If day 16-31
            if (day >= 16 && day <= 31) {
                System.out.println("Spring");
            }
        }
        // If April or May
        if (month == 4 || month == 5) {
            System.out.println("Spring");
        }
        // If June
        if (month == 6) {
            // If day 1-15
            if (day >= 1 && day <= 15) {
                System.out.println("Spring");
            }
            // If day 16-31
            if (day >= 16 && day <= 30) {
                System.out.println("Summer");
            }
        }
        // If July or August
        if (month == 7 || month == 8) {
            System.out.println("Summer");
        }
        // If September 
        if (month == 9) {
            // If day 1-15
            if (day >= 1 && day <= 15) {
                System.out.println("Summer");
            }
            // If day 16-31
            if (day >= 16 && day <= 30) {
                System.out.println("Fall");
            }
        }
        // If October or November
        if (month == 10 || month == 11) {
            System.out.println("Fall");
        }
        // If December
        if (month == 12) {
            // If day 1-15
            if (day >= 1 && day <= 15) {
                System.out.println("Fall");
            }
            // If day 16-31
            if (day >= 16 && day <= 31) {
                System.out.println("Winter");
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create scanner for user input
        Scanner input = new Scanner(System.in);
        // Ask user for day number
        System.out.println("What is the day as an integer?");
        // Store day integer
        int day = input.nextInt();
        // Ask user for month number
        System.out.println("What is the month as an integer?");
        // Store month integer
        int month = input.nextInt();

        // Output season using method
        season(day, month);

    }
}
