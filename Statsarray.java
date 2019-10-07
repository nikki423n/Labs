import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Statsarray
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        int[] numbers = new int[10];
        /*
         * code for average
         */
        double sum = 0;
        for (int i= 0 ; i<10 ; i++)
        {
            numbers[i] = in.nextInt();
            sum = sum + numbers[i];
        }
        double average = sum/10;
        System.out.printf("Average = %.2f\n", average);
        /*prints out to 2 decimal places
         * code for standard deviation
         */
        double SD = 0;
        for (int i = 0; i<10; i++)
        {
            SD = SD + Math.pow(numbers[i] - average, 2);
        }
        double StandardDeviation = Math.sqrt(SD/10);
        System.out.printf("StandardDeviation = %.2f\n",StandardDeviation);
    }

}

