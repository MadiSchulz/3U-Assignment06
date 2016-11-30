
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
public class Test {

    public static void firstDigit(int number) {
        // ???
        while (number > 9) {
            number = number / 10;
        }
        if (number <= 9) {
            System.out.println(number);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        firstDigit(number);

    }

}
