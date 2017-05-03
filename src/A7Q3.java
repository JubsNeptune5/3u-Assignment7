
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author laveh2107
 */
public class A7Q3 {

    public static int factors(int num) {
        //Create a double of the number to compare withe the integer
        double NUM = num;
        //Create a variable for the factors of the number starting wiht the number 
        int factor = num;
        
        //Starts at the number then works their way down to two 
        for (int i = num; i >= 2; i--) {
            //Divid the number by the value in the for loop
            factor = num / i;
            //Replicate the same thing as a double
            double FACTOR = NUM / i;
            //If both the integer and the double are the same, the number is divisable by i equally
            if (factor == FACTOR) {
                //Print out the integer
                System.out.println(factor);
            }
        }
        
        //Return the number as the number divisable by one is itself
        return num;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initalize an input scanner
        Scanner input = new Scanner(System.in);

        //Input the variable of the mark
        int n = input.nextInt();

        //print out the list of the multiples of the value n
        System.out.println("Are the factors of " + n + " are:");
        System.out.println(factors(n));



    }
}
