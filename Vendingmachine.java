import java.util.Scanner;
import java.lang.String;

public class Vendingmachine
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        final int PENNIES_PER_DOLLAR = 100;
        final int PENNIES_PER_QUARTER = 25;
        isolatedIO.inputString("Enter bill value (1 = $1 bill, 5 = $5 bill, etc.): ");

        int billValue = in.nextInt();

        isolatedIO.inputString("Enter coin value (1 = 1 quarter, 2 = 2 quarters, etc.): ");
        int coinValue = in.nextInt();

        isolatedIO.inputString("Enter item price in pennies: ");
        int itemPrice = in.nextInt();
        // compute change due
        int changeDue = ((PENNIES_PER_DOLLAR * billValue) + (PENNIES_PER_QUARTER * coinValue)) - itemPrice;
        int dollarCoins = changeDue / PENNIES_PER_DOLLAR;
        changeDue = changeDue % PENNIES_PER_DOLLAR;
        int quarters = changeDue / PENNIES_PER_QUARTER;
        changeDue = changeDue % PENNIES_PER_QUARTER;
        // Print change due
        System.out.printf("Dollar coins: %6d", dollarCoins);
        System.out.println();
        System.out.printf("Quarters:     %6d", quarters);
        System.out.println();
    }
}

