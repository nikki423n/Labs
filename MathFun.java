
/**
 * primitive data types (such as int or double) and corresponding class(such as Integer or Double)
 * classes, methods, and constants dealing with primitive data types
 *
 * @author Nicole Nguyen
 * @version 9/9/19
 */
public class MathFun
{
    public static void main()
    {
        int a = 2;
        int b = 3;
        b = a +b;
        System.out.println(" 2 + 3 = " +b);
        double c = 17;
        double d = 4;
        d = c % d;
        System.out.println("17 % 4 = " + d);
        int sum = 4 + 9;
        double division = 46/7;
        double remainder = 46%7;
        double multiply = 2*3.0;
        System.out.println("4+9 = " +sum + " , " + "46/7 = " +division + " , " + "46%7 = " + remainder + " , " + "2*3.0 = " +multiply);
        int q = 25/4;
        double w = 7.75 + 2;
        int e = 105;
        char r = 'P';
        System.out.println("25/4 = "+q + " , " + "7.75 + 2 = "+w + " , " + e + " , " + r);
    }
}
