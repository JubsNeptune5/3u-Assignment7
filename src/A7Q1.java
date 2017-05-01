
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Find the Area of the circle
 * @author laveh2107
 */
public class A7Q1 {
/**
 * Calculate the area of the circle
 * @param radius radius of the circle
 * @return is the area of the circle
 */
    public static double circleArea(double radius){
         //Calculate the area
        double rSquared = Math.pow(radius, 2);
        double area = Math.PI * rSquared;
        
        //Send back the answer
        return area;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);
        
        //Have person enter the radius
        System.out.println("Please enter the radius");
        double radius = input.nextDouble();
        
        //Create a variable to store the answer
        double answer = circleArea(radius);
        
        System.out.println("The area of the circle is: "+ answer);
    }
}
