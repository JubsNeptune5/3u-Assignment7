
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Changing the mark to a grade
 * @author laveh2107
 */
public class A7Q2 {
/**
 * Find an appropriate letter grade for the percentage mark
 * @param mark The percentage mark that was given by teacher
 * @return  The letter grade assigned to the percentage
 */
    public static String examGrade(double mark){
        //Assume the persons mark starts below a 50
        String grade = "F";
        
        //Raise the grade as it goes from <50 to 50-59
        if(mark>=50){
            grade = "D";
        }
        //Raise the grade as it goes from 50-59 to 60-69
        if(mark>=60){
            grade = "C";
        }
        //Raise the grade as it goes from 60-69 to 70-79
        if(mark>=70){
            grade = "B";
        }
        //Raise the grade as it becomes higher than a 79
        if(mark>=80){
            grade = "A";
        }
     //Give the grade as an answer
     return grade;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initalize an input scanner
        Scanner input = new Scanner (System.in);
        
        //Input the variable of the mark
        double mark = input.nextDouble();
       
        //Print out the grade
        System.out.println("Your grade is: ");
        System.out.println(examGrade(mark));
        
    }
}
