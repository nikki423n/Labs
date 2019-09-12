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
        Scanner q = new Scanner(System.in);
        double a, b, c;
        double root1, root2;

        System.out.println("Enter the a coefficient: ");
        a = q.nextDouble();

        System.out.println("Enter the b coefficient: ");
        b = q.nextDouble();

        System.out.println("Enter the c coefficient: ");
        c = q.nextDouble();

        root1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);

        root2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);

        System.out.printf("The first root is = %.4f\n", root1);
        System.out.printf("The second root is = %.4f\n", root2);
    }
}