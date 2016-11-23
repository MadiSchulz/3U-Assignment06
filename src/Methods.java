
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author schum0689
 */
public class Methods {
    // First example

    public static void sayHello() {
        System.out.println("Hello World!");
    }

    // Can use the same method, but parameters (brackets) must be different
    public static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    // Calculate area of a rectangle
    public static double calcRectArea(double length, double width) {
        double answer = length * width;
        return answer;
    }
    // void changes to int, then add a return answer;

    public static void add(int num1, int num2, int answer) {
        answer = num1 + num2;
        // else, return 42
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // First example
        sayHello();

        // Second example with name
        sayHello("Bob");
        sayHello("Nancy");

        // Example 3
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name1 = input.nextLine();

        // Now using a method, variable name in methods and name1 below are storing the same info
        sayHello(name1);

        // Calculate area of a rectangle
        System.out.println("Please input a length");
        double length = input.nextDouble();
        System.out.println("Please input a width");
        double width = input.nextDouble();
        // Store in new variable
        double area = calcRectArea(2.5, 2.0);
        // Now output to user
        System.out.println("Area is " + area);


        int answer = 0;
        // Answer is 0 because actual answer only exists up top
        // answer = (line below)
        add(5, 3, answer);
        // Everything is 0; variables inside the method get deleted because they are temporary variables
        System.out.println(answer);


    }
}
