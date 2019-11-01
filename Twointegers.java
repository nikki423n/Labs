//Find the difference, maximum, and minimum of two numbers using Math.min, Math.max, and Math.abs
//import java.util.Scanner;
public class Twointegers
{
    public static void main(String[] args)
    {
        String imp = ConsoleIO.getString("This is a program to find the sum, difference, average, distance, max, and min of 2 integers"); 

        int x =  ConsoleIO.getInt("Enter a number: ");

        int y =  ConsoleIO.getInt("Enter another number: ");
        int sum = x + y;
        int difference = x - y;
        double average = (x + y)/2.0;
        int distance = Math.abs(x - y);
        int maximum = Math.max(x,y);
        int minimum = Math.min(x,y);
        /*to find minimum of two int values use static int min(int x, int y)
         * method of Math class
         */
        ConsoleIO.printString("sum:" +sum);
        ConsoleIO.printString("difference:" +difference);
        ConsoleIO.printString("average:" +average);
        ConsoleIO.printString("distance:" +distance);
        ConsoleIO.printString("max:" +maximum);
        ConsoleIO.printString("min:" +minimum);
    }
}