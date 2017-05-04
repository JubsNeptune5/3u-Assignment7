
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laveh2107
 */
public class A7Q7 {

    public static int firstDigit(int num){
        return 0;
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Insert Scanner
        Scanner input = new Scanner(System.in);

        //Ask user for the number
        System.out.println("Please enter the integer you wish to find the first digit of");
        int num = input.nextInt();

        //Have the number run through the method
        System.out.println("The last digit of " + num + " is: " + firstDigit(num));
    }
}
