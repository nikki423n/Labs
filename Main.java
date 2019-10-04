import chn.util.*;

/**
 * Write a description of class Main here.
 *
 * @author Nicole Nguyen
 * @version (a version number or a date)
 */

public class Main
{
    public static void Main()
    {
        ConsoleIO input = new ConsoleIO();
        
        int sel;
        int rep = 1;
        while(rep == 1)
        {
                
            System.out.println("Please select a program to run: ");
            System.out.println("1.) House ");
            System.out.println("2.) Benzene ");
            System.out.println("3.) Quadratic ");
            System.out.println("4.) GregorianCalenddar ");
            System.out.println("5.) MathFun ");
            System.out.println("6.) Twointegers ");
            System.out.println("7.) Vendingmachine ");
            System.out.println("8.) Change ");
            System.out.println("9.) Statsarray");
            System.out.println("10.) Palindrome");
            System.out.println("11.) PigLatinator");
            System.out.print("?.) ");
            sel = input.readInt();
            
            switch(sel){
                case 1:
                    House houseObject = new House();
                    houseObject.main();
                    break;
                case 2:
                    Benzene benzeneObject = new Benzene();
                    benzeneObject.main();
                    break;
                case 3:
                    Quadratic quadraticObject = new Quadratic();
                    quadraticObject.main();
                    break;
                case 4:
                    GregorianCalenddar gregorianCalenddarObject = new GregorianCalenddar();
                    gregorianCalenddarObject.main();
                    break;
                case 5:
                    MathFun mathFunObject = new MathFun();
                    mathFunObject.main();
                    break;
                case 6:
                    Twointegers twointegersObject = new Twointegers();
                    twointegersObject.main();
                    break;
                case 7:
                    Vendingmachine vendingmachineObject = new Vendingmachine();
                    vendingmachineObject.main();
                    break;
                case 8:
                    Change changeObject = new Change();
                    changeObject.main();
                    break;
                case 9:
                    Statsarray statsarrayObject = new Statsarray();
                    statsarrayObject.main();
                    break;
                case 10:
                    Palindrome palindromeObject = new Palindrome();
                    palindromeObject.main();
                    break;
                case 11:
                    pigMain pigMainObject = new pigMain();
                    pigMain.main();
                    break;
                default:
                    System.out.println("Please try again.");
            }
            
            System.out.println("Would you like to run another program? [0/1]");
            System.out.print("?.) ");
            rep = input.readInt();
        }
    }
}
