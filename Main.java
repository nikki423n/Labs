import java.util.*;

/**
 * Description of class Portfolio here.
 *
 */
public class Main
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        String response;
        Character x;

        //escape at 0
        do
        {
            //prompt
            System.out.println("|====================================="); 
            System.out.println("| MENU SELECTION PORTFOLIO");
            System.out.println("|=====================================");
            System.out.println("| Options: ");
            System.out.println("| 0. Exit");
            System.out.println("| A. House");
            System.out.println("| B. Benzene");
            System.out.println("| C. Quadratic");
            System.out.println("| D. GregorianCalenddar");
            System.out.println("| E. MathFun");
            System.out.println("| F. Twointegers");
            System.out.println("| G. Vendingamachine");
            System.out.println("| H. Change");
            System.out.println("| I. Statsarray");
            System.out.println("| J. Palindrome");
            System.out.println("| K. PigLatinator");
            System.out.println("| L. PalindromeI&J");
            System.out.println("| M. PalindromeRecursion");
            System.out.println("| N. PalindromeReverseString");
            System.out.println("|=====================================");
            System.out.println("| Pick your choice: ");
            response = input.next();
            x = response.charAt(0);
            x = Character.toLowerCase(x);

            switch(x)
            {
                case 'a': 
                callLab1();
                break;
                case 'b': 
                callLab2();
                break;
                case 'c': 
                callLab3();
                break;
                case 'd': 
                callLab4();
                break;
                case 'e': 
                callLab5();
                break;
                case 'f': 
                callLab6();
                break;
                case 'g': 
                callLab7();
                break;
                case 'h': 
                callLab8();
                break;
                case 'i': 
                callLab9();
                break;
                case 'j': 
                callLab10();
                case 'k': 
                callLab11();
                break;
                case 'l':
                callLab12();
                break;
                case 'm':
                callLab13();
                break;
                case 'n':
                callLab14();
                break;
                case '0': 
                break;
                default:
                break;

            }
        }
        while(x != '0');

    }

    //Callin the Labs
    public static void callLab1()
    {
        String[] args = new String[] {""};
        House.main(args);
    }

    public static void callLab2()
    {
        String[] args = new String[] {""};
        Benzene.main(args);
    }

    public static void callLab3()
    {
        String[] args = new String[] {""};
        Quadratic.main(args);
    }

    public static void callLab4()
    {
        String[] args = new String[] {""};
        GregorianCalenddar.main(args);
    }

    public static void callLab5()
    {
        String[] args = new String[] {""};
        MathFun.main(args);
    }

    public static void callLab6()
    {
        String[] args = new String[] {""};
        Twointegers.main(args);
    }

    public static void callLab7()
    {
        String[] args = new String[] {""};
        Vendingmachine.main(args);
    }

    public static void callLab8()
    {
        String[] args = new String[] {""};
        Change.main(args);
    }

    public static void callLab9()
    {
        String[] args = new String[] {""};
        Statsarray.main(args);
    }

    public static void callLab10()
    {
        String[] args = new String[] {""};
        Palindrome.main(args);
    }

    public static void callLab11()
    {
        String[] args = new String[] {""};
        pigMain.main(args);
    }

    public static void callLab12()
    {
        String[] args = new String[] {" "};
        PalindromeIJ.main(args);
    }

    public static void callLab13()
    {
        String[] args = new String[] {" "};
        PaliRecursion.main(args);
    }
    public static void callLab14()
    {
        String[] args = new String[] {" "};
        PaliReverseString.main(args);
    }
}
