import java.util.Scanner;
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
       Scanner inp = new Scanner(System.in);
       
        ConsoleIO.getString("Enter the purchase amount");
        purchaseAmount = inp.nextDouble();
       
        ConsoleIO.getString("Enter cash paid: ");
        cashPaid = inp.nextDouble();
        
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