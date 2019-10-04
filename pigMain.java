import java.util.Scanner;
 
 
public class pigMain
{
 
    public static void main()
    {
        Scanner inp = new Scanner(System.in);
       
        String ans;
        String userInput;
       
        do
        {
            PigLatin pigObject = new PigLatin();
            System.out.println("Enter a string:");
            userInput = inp.nextLine();
           
            char [] input_array = userInput.toCharArray();
            pigObject.convert(input_array);
            pigObject.printOutput();
           
            System.out.print("Would you like to translate another phrase? ");
            ans = inp.nextLine();
           
            System.out.println("");
        }
        while (ans.charAt(0) == 'y');
    }
   
}