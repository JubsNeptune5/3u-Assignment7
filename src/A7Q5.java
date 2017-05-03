
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laveh2107
 */
public class A7Q5 {
/**
 * Find the random numbers from 1 to 5 and change them into asterisks
 * @param lines how many lines of random numbers is wanted
 * @return 
 */
    public static int chaotic(int lines) {
        //Create for loop to run through the values leading up to the value of the lines
        for (int i = 1; i <= lines; i++) {

            //Do the math random method for random numbers from 1-5
            int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;
            
            //Print out the number of asterisks according to the random number 
            if (randNum == 1) {
                System.out.println("*");
            }
            if (randNum == 2) {
                System.out.println("**");
            }
            if (randNum == 3) {
                System.out.println("***");
            }
            if (randNum == 4) {
                System.out.println("****");
            }
            if(randNum == 5){
                System.out.println("*****");
            }
        }
        return 0;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create input scanner
        Scanner input = new Scanner(System.in);

        //Ask the user for number of lines
        System.out.println("Please enter the number of lines");
        
        //Create avriable lines for number of lines
        int lines = input.nextInt();
        
        //Put lines inside the method
        chaotic(lines);
        
    }
}
