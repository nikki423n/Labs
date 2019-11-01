//import java.util.Scanner;
import java.lang.Math;
/**
 *
 *   Quadratic equation
 * @author Nicole Nguyen
 * @version (a version number or a date)
 */
public class Quadratic
{
    public static void main(String[] args)
    {
        // Define variables
        
       double root1, root2;

        // Get the coefficient in front of x^2
       double a = ConsoleIO.getDouble("Enter the a coefficient: ");
        

        // Get the coeficient in front of x
       double b = ConsoleIO.getDouble("Enter the b coefficient: ");
       

        // Get constant term
       double c = ConsoleIO.getDouble("Enter the c coefficient: ");
       
        // calculate the roots using quadratic formula
        root1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a); 

        root2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
       
        String f = ("The first root is = " + root1);
        ConsoleIO.printString(f);
        String q = ("The second root is = "+ root2);
        ConsoleIO.printString(q);
    }
}