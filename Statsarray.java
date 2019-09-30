import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Statsarray
{
    public static void main()
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
        /*
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
    public static int mode(int[] numbers)
    {
        int max = 0;
        int maxCount = 0;
        
        Arrays.sort(numbers); //sorts the array in increasing order
        
        max = numbers[numbers.length - 1];
        int[] count = new int[max + 1];

        for (int i=0; i < 10; i++)
        {
            count[numbers[i]]++;
        }
        for (int i=0; i < count.length; i++)
        {
            if (count[i] > maxCount)
            {
                maxCount = count[i];
            }
        }
        for (int i = 0; i <count[i]; i++)
        {
            if (count[i] == maxCount)
            {
                return i;
                
            }
        }
        return -1;
        System.out.println("\nMode = " + mode(numbers[i]));
    }
}



