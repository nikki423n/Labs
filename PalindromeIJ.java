//import java.util.Scanner;
public class PalindromeIJ
{
    public static void main(String[] args)
    {
        String input = ConsoleIO.getString("This is palindrome I&J --> Enter a palindrome candidate").toLowerCase();
        
        if (isPalindrome(input))
            ConsoleIO.printString(input + " is a Palindrome");
        else
            ConsoleIO.printString(input + " is not a Palindrome");
    }

    static boolean isPalindrome(String input) //calling a method
    {
        int i = 0;
        int j = 0;
        j = input.length()-1;
        while (i < j) //stops when i crosses j
        {
            char frontChar = input.charAt(i);
            char lastChar = input.charAt(j);
            if (frontChar < 'a' || frontChar >'z') //checks to see if i is a character
                i++;
            else if (lastChar < 'a' || lastChar > 'z') // checks to see if j is a character
                j--;
            else
            {
                if (frontChar != lastChar )//when both the top fails, compares if i & j are the same
                    return false;
                else
                {
                    i++;
                    j--;
                }
            }
        }
        return true;

    }
}

