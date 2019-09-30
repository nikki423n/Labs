import java.util.Scanner;
/**
* Write a description of class Change here.
*
* @author Nicole Nguyen
* @version (a version number or a date)
*/
public class Change
{
 
    public static void main()
    {
        double purchaseAmount, cashPaid, temp;
        int change;
       Scanner inp = new Scanner(System.in);
       
        System.out.println("Enter the purchase amount");
        purchaseAmount = inp.nextDouble();
       
        System.out.println("Enter cash paid: ");
        cashPaid = inp.nextDouble();
        
        temp = cashPaid - purchaseAmount;
        temp = temp - (int)temp + 0.00001;
       
        change = (int)(temp * 100);
       
        System.out.println("The number of quarters = " + (change/25));
       
        change = change - (change/25)*25;
       
        System.out.println("The number of dimes = " + (change/10));
       
        change = change - (change/10)*10;
       
        System.out.println("The number of nickels = " + (change/5));
       
        change = change - (change/5)*5;
       
        System.out.println("The number of pennies = " + change);
       
    }
}