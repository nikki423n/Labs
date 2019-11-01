 
 
public class pigMain
{
    public static void main(String[] args)
    {
        String ans;
        String userInput;
       
        do
        {
            PigLatin pigObject = new PigLatin();
            userInput = ConsoleIO.getString("This is pigLatinator. It converts a string to piglatin --> Enter a string: ");
           
            char [] input_array = userInput.toCharArray();
            pigObject.convert(input_array);
            pigObject.printOutput();
           
            ans = ConsoleIO.getString("Would you like to translate another phrase? ");
           
            System.out.println("");
        }
        while (ans.charAt(0) == 'y');
    }
   
}