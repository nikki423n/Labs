import java.util.Scanner;
import java.lang.String;

public class PaliRecursion
{
    public static void main(String[] args)
    {   String input = ConsoleIO.getString("Enter a palindrome candidate").toLowerCase();
        if (isPalindrome(input))
            ConsoleIO.printString(input + " is a Palindrome");
        else
            ConsoleIO.printString(input + " is not a Palindrome");
    }

    static boolean isPalindrome(String input)
    {
        int i = findFirstLetter(input);
        int j = findLastLetter(input);
        char frontChar = input.charAt(i);
        char lastChar = input.charAt(j);
        if (i >= j) //checks when to stop
            return true;
        if (frontChar != lastChar) // if the front character is not equal to the last character, then the string is not a palindrome
            return false;
        else
            return isPalindrome(input.substring(i+1,j));
        //extracting a substring of text from i+1 from j 
    }

    static int findFirstLetter(String input)
    {
        int i = 0;
        for (i = 0; i <input.length(); i++)
            if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z')
                return i;
        return input.length();
    }

    static int findLastLetter(String input)
    {
        int j;
        for (j = input.length() - 1; j>=0; j--)
            if (input.charAt(j) >= 'a' && input.charAt(j) <= 'z')
                return j;
        return -1;
    }
}

