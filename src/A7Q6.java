
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Find the last digit of a number
 *
 * @author laveh2107
 */
public class A7Q6 {

    /**
     * To find the remainder of the number divided by ten
     *
     * @param num the number one needs the last digit of
     * @return The last digit
     */
    public static int lastDigit(int num) {

        //find the remainer of the number divided by ten which is the first digit
        int x = num % 10;
        //Make the negative muber, if any become positive
        if(x < 0){
            x=x*(-1);
        }
        //Returnn the last digit
        return x;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Insert Scanner
        Scanner input = new Scanner(System.in);

        //Ask user for the number
        System.out.println("Please enter the integer you wish to find the last digit of");
        int num = input.nextInt();

        //Have the number run through the method
        System.out.println("The last digit of " + num + " is: " + lastDigit(num));
    }
}
