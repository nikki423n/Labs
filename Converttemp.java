import java.util.Scanner;
public class Converttemp
{
    public static void main(String[] args)
    {
        double celsius, farhenheit;
        Scanner imp = new Scanner(System.in);
        System.out.println ("Enter celsius;");
        celsius = imp.nextDouble();
        farhenheit = 9.0/5.0 * celsius + 32.0;
        System.out.println("farhenheit = " + farhenheit);
    }
}