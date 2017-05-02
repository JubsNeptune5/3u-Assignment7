
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
        for (int i = 1; i < num; i++) {
            int factor = num/i;        
        }




        return factor;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initalize an input scanner
        Scanner input = new Scanner(System.in);

        //Input the variable of the mark
        int n = input.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println(factors(n));
        }
        

    }
}
