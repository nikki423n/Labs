import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args)
    {
        String Input = isolatedIO.inputString("Enter a palindrome string");
        boolean isPalindrome = true;
        
        String newInput = Input.replaceAll("[^a-zA-Z]", ""); 
        //removes all non-alpha characters like , . ?
        char[] myInput = newInput.toCharArray(); 
        //converts string to an array of characters
        System.out.println(newInput);
        //prints out the string without non-alpha characters
        int myInputLength = myInput.length;

        for (int i = 0; i < myInputLength; i++)
        {
            if (Character.toLowerCase(myInput[i]) != Character.toLowerCase(myInput[myInputLength-1-i]))//myInput[myInputLength-1-i] is the opposite character in a string
            {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome)
            isolatedIO.outputString(Input + " is a Palindrome");
        else
            isolatedIO.outputString(Input + " is not a Palindrome");
    }
}

        