import java.util.Scanner;
public class pigLatinator
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("This is a pigLatinator. It can translate the Enlighs word into the Pig latin word.");
        System.out.println("Enter an English word: ");
        String englishWord = in.nextLine();
        String newWord = englishWord.replaceAll("[^a-zA-Z]", "");
        //removes all non-alpha characters like ? . , ; :
        char[] arrayWord = newWord.toCharArray();
        //converts string to an array of characters
        
        String lowercase = englishWord.toLowerCase();
        int[] englishWord = new Int[englishWord.length];
        char vowels = {'a','e', 'i', 'o', 'u'};
        
        String noVowel = 0;
        boolean hasVowel = true;
        
        for (i = 0; i < englishWord.length; i++)
        {
            if (lowercase != 
        