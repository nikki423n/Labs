//import java.util.Scanner;
/**
 * Write a description of class Change here.
 *
 * @author Nicole Nguyen
 * @version (a version number or a date)
 */
public class Change
{
    public static void main(String[] args)
    {
        double purchaseAmount, cashPaid, temp;
        int change;
        String in = ConsoleIO.getString("This is a change system. It prints out your change!");
        purchaseAmount = ConsoleIO.getDouble("Enter the purchase amount");

        cashPaid = ConsoleIO.getDouble("Enter cash paid: ");
        temp = cashPaid - purchaseAmount;
        temp = temp - (int)temp + 0.00001;

        change = (int)(temp * 100);

        ConsoleIO.printString("The number of quarters = " + (change/25));

        change = change - (change/25)*25;

        ConsoleIO.printString("The number of dimes = " + (change/10));

        change = change - (change/10)*10;

        ConsoleIO.printString("The number of nickels = " + (change/5));

        change = change - (change/5)*5;

        ConsoleIO.printString("The number of pennies = " + change);

    }
}