import java.util.Scanner;
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
        Scanner q = new Scanner(System.in);
        double a, b, c;
        double root1, root2;

        // Get the coefficient in front of x^2
       ConsoleIO.getString("Enter the a coefficient: ");
        a = q.nextDouble();

        // Get the coeficient in front of x
        ConsoleIO.getString("Enter the b coefficient: ");
        b = q.nextDouble();

        // Get constant term
        ConsoleIO.getString("Enter the c coefficient: ");
        c = q.nextDouble();

        // calculate the roots using quadratic formula
        root1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);//the 

        root2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
       

        System.out.printf("The first root is = %.4f\n", root1);
        System.out.printf("The second root is = %.4f\n", root2);
    }
}