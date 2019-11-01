//import java.util.Scanner;

public class PaliReverseString
{
    public static void main(String args[])
    {
        String userInput, reversed;
        //storing input and reversed string

        userInput = ConsoleIO.getString("Hi this is reverse string palindrom! Enter a palindrome string: ");
        String input = userInput.replaceAll("[^a-zA-Z]","");
        //replace all noncharacters with nothing
        input = input.toLowerCase();
        //changes the string to lowercase

        reversed = reverse(input);
        //reverses the the string

        ConsoleIO.printString("The string reverse: " + reversed);
        if (input.equals(reversed)) // if the userInput = to its reverse
            ConsoleIO.printString(userInput + " is a palilndrome");
        else

            ConsoleIO.printString(userInput + " is NOT a palindrome");
    }

    static String reverse(String input)
    {
        String reversed = "";
        //storing the reverse of the string
        for (int i = 0;i < input.length(); i++)
        {
            reversed = input.charAt(i) + reversed;
        }
        return reversed;
    }
}

