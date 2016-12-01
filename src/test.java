
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
public class test {

    public static boolean isSingleDigit (int x) { 
    if (x >= 0 && x < 10) { 
      return true; 
    } else { 
      return false; 
    } 
  }
    
    public static int modulo(int integer){
        int remainder = integer % 2;
        return remainder;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Input #:");
        int integer = input.nextInt();
        
        int remainder = modulo(integer);
        
        System.out.println(remainder);
    }
    
}
