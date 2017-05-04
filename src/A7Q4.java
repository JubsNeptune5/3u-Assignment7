
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author laveh2107
 */
public class A7Q4 {

    /**
     * Math to find new balance of the account with compound interest following
     * the formula B=P(1+r)^n
     *
     * @param initial The original amount of the account
     * @param rate The interest rate per year
     * @param years The number of years
     * @return
     */
    public static double compoundInterest(double initial, double rate, double years) {
        //find the answer to the (1+r)^n  part of the formula
        double rSquared = Math.pow((1 + rate), years);

        //Multiply the newly found rSquared by the initial cost
        double newBalance = rSquared * initial;

        //Return the newBalance as the answer
        return newBalance;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create input scanner
        Scanner input = new Scanner(System.in);

        //Ask the user for the unknown variables
        System.out.println("Please enter the initial amount");
        //Create variable for the intial amount
        double initial = input.nextDouble();

        System.out.println("Please enter the rate of interest");
        //Create variable for the rate of intrest
        double rate = input.nextDouble();

        System.out.println("Please enter the number of years");
        //Create a variable for the number of years gone by
        double years = input.nextDouble();

        //Say out the new balance with the variable plugged into the method compoundInterest
        System.out.println("The new balance in your account is: " + compoundInterest(initial, rate, years));
    }
}
