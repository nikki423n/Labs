import java.util.Scanner;
 
public class Pigmain
{
 
    public static void main(String args[])
    {
        Scanner inp = new Scanner(System.in);
        PigLatin pigObject = new PigLatin();
        char cont;
        String cont_string;
        String user_input;
       
        do
        {
            System.out.println("Enter a string:");
            user_input = inp.nextLine();
            pigObject.convert(user_input);
            pigObject.printOutput();
           
            System.out.print("Would you like to translate another phrase? ");
            cont_string = inp.nextLine();
            cont = cont_string.charAt(0);
           
            System.out.println("");
           
            pigObject.reset();
        }
        while (cont == 'y');
    }
   
}
