import java.util.Scanner;
class isolatedIO
{
    //instance variables
    public static void outputString(String msg)
     {
         System.out.println(msg);
     }
        
    public static String inputString(String msg)
    {
        //BlueJ clear console command
        System.out.print("\u000c");
        System.out.println(msg);
        Scanner ans = new Scanner(System.in);
        
        return ans.nextLine();
    }
}