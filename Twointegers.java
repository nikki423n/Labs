/*Find the difference, maximum, and minimum of two numbers using Math.min, Math.max, and Math.abs
 * 
 * 
 */
import java.util.Scanner;
public class Twointegers
{
    public static void main(String[] args)
    {
        Scanner imp = new Scanner(System.in);
        int x = 5;
        int y = 8;
        isolatedIO.inputString("Enter a number: ");
        x = imp.nextInt();
        isolatedIO.inputString("Enter another number: ");
        y = imp.nextInt();
        int sum = x + y;
        int difference = x - y;
        double average = (x + y)/2.0;
        int distance = Math.abs(x - y);
        int maximum = Math.max(x,y);
        int minimum = Math.min(x,y);
        /*to find minimum of two int values use static int min(int x, int y)
         * method of Math class
         */
        isolatedIO.outputString("sum:" +sum);
        isolatedIO.outputString("difference:" +difference);
        isolatedIO.outputString("average:" +average);
        isolatedIO.outputString("distance:" +distance);
        isolatedIO.outputString("max:" +maximum);
        isolatedIO.outputString("min:" +minimum);
    }
}