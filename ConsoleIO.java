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

    static public int getInt(String prompt)
    {
        int number;

        Scanner inp = new Scanner(System.in);

        System.out.println(prompt);

        number = inp.nextInt();

        return number;
    }

    static public double getDouble(String prompt)
    {
        double num;

        Scanner inp = new Scanner(System.in);

        System.out.println(prompt);

        num = inp.nextDouble();

        return num;
    }
}
