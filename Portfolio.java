
/**
 * This is my profile. There are labs and other stuff in it
 *
 * @author Nicole Nguyen
 * @version 
 */
import java.util.Scanner;
public class Portfolio
{
    // instance variables - replace the example below with your own
    private int errCode;
    public Portfolio()
    {
        // initialise instance variables
        errCode = 0;
    }

    public static void main(String [] args){
        Scanner keyboard = new Scanner (System.in);
        Portfolio runner = new Portfolio();
        System.out.print('\u000C');
        System.out.println("HELLO Mr. M! You are going to see Nicole's Portfolio.");
        //System.out.println("What would you like to see first?");
        System.out.println("type  to exit");
        System.out.println("type burger to continue");
        int exit= keyboard.nextInt();

        while(exit!=0){
            System.out.println("What would you like to see");
            System.out.println("Press 1 for Countdown Song");
            System.out.println("Press 2 for Midterm Sample Question");
            int answer = keyboard.nextInt();
            if(answer==1){
                runner.CountdownSong();
            }
            if(answer==2){
                runner.midtermQuestion();

            }
            System.out.println("Press 0 to exit");
            System.out.println("Press 3 to stay");
            exit = keyboard.nextInt();
        }

    }

    public void CountdownSong()
    { 
        Scanner keyboard = new Scanner (System.in);
        System.out.print('\u000C');
        System.out.println("What animal do you want");
        String animal = keyboard.nextLine();
        System.out.println("How many " + animal+ "s do you want jumping on the bed?");
        int number = keyboard.nextInt();
        System.out.println(number + " " + animal + "s jumping on the bed");
        for(int i=number; i>0; i--){
            System.out.println("One fell off and broke his head");
            System.out.println("Mama called the doctor and the doctor said");
            int newNumber = i-1;
            System.out.println(newNumber +" "+ animal + "s jumping on the bed");
        }

    }

    public void midtermQuestion(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println('\u000C');
        System.out.println("What data type returns either true or false?");
        System.out.println("String");
        System.out.println("Int");
        System.out.println("Boolean");
        System.out.println("Long");

        String answer = keyboard.nextLine();

        if(answer.equals("Boolean")){
            System.out.println("Correct!");

        }
        else{
            System.out.println("Incorrect, Sorry");
        }
    }

    public void Lab1(){

    }
}