//import java.util.Scanner;
import java.lang.String;

public class Vendingmachine
{
    public static void main(String[] args)
    {
        
        final int PENNIES_PER_DOLLAR = 100;
        final int PENNIES_PER_QUARTER = 25;
       
        int billValue = ConsoleIO.getInt("Enter bill value (1 = $1 bill, 5 = $5 bill, etc.): ");

        
        int coinValue = ConsoleIO.getInt("Enter coin value (1 = 1 quarter, 2 = 2 quarters, etc.): ");

        int itemPrice = ConsoleIO.getInt("Enter item price in pennies: ");
        // compute change due
        int changeDue = ((PENNIES_PER_DOLLAR * billValue) + (PENNIES_PER_QUARTER * coinValue)) - itemPrice;
        int dollarCoins = changeDue / PENNIES_PER_DOLLAR;
        changeDue = changeDue % PENNIES_PER_DOLLAR;
        int quarters = changeDue / PENNIES_PER_QUARTER;
        changeDue = changeDue % PENNIES_PER_QUARTER;
        // Print change due
        String f = ("Dollar coins: " + dollarCoins);
        ConsoleIO.printString(f);
        String Q = ("Quarters: " + quarters);
        ConsoleIO.printString(Q);
        
    }
}

