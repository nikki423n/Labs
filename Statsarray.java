
import java.lang.Math;
import java.util.Arrays;
import java.lang.*;
public class Statsarray
{
    public static void main(String[] args)
    {
      
        String in = ConsoleIO.getString("Enter 10 numbers:");
        int[] numbers = new int[10];
        /*
         * code for average
         */
        double sum = 0;
        for (int i= 0 ; i<10 ; i++)
        {
            numbers[i] = ConsoleIO.getInt("Enter a number: ");
            sum = sum + numbers[i];
        }
        double average = sum/10;
        ConsoleIO.printString("Average =" + average);
        /*prints out to 2 decimal places
         * code for standard deviation
         */
        double SD = 0;
        for (int i = 0; i<10; i++)
        {
            SD = SD + Math.pow(numbers[i] - average, 2);
        }
        double StandardDeviation = Math.sqrt(SD/10);
        ConsoleIO.printString("StandardDeviation = " + StandardDeviation);
    }

}

