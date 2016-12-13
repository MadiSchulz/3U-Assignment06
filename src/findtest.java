/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author madis
 */
public class findtest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
String string = "hi--there-you.";
String dash = "-";

System.out.println(string.indexOf(dash));
System.out.println(string.lastIndexOf(dash));

// find all occurrences forward
for (int i = -1; (i = string.indexOf(dash, i + 1)) != -1; ) {
    System.out.println(i);
} // prints "4", "13", "22"

    }
    
}
