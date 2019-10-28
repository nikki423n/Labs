import java.util.Scanner;

public class ConsoleIO
{
 
    static public String getString(String prompt)
    {
        String text;
        
        Scanner inp = new Scanner(System.in);
        
        System.out.println(prompt);
        
        text = inp.nextLine();
        
        return text;
        
    }
    
    static public void printString(String text)
    {
        
        System.out.println(text);
        
    }
}
