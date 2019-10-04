import java.util.Scanner;
public class pigLatinator
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("This is a pigLatinator. It can translate the Enlighs word into the Pig latin word.");
        System.out.println("Enter an English word: ");
        
        String userInput = in.nextLine();
        String newWord = userInput.replaceAll("[^a-zA-Z]", "");
        //removes all non-alpha characters like ? . , ; :
        
        char[] vowels = {'a','e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int vowelIndex = 100; //if no vowel, vowel index = 100

        boolean hasVowel = true;
        int length = englishWord.length();
        
        for (int i = 0; i < length; i++)
        {
            if (hasVowel && (englishWord.charAt(0) != 'a' || englishWord.charAt(0) != 'e' || englishWord.charAt(0) != 'i' ||
            englishWord.charAt(0) != 'o' || englishWord.charAt(0) != 'u'))
                System.out.print( "ay");
            else
            if (hasVowel && (englishWord.charAt(0) == 'a' || englishWord.charAt(0) == 'e' || englishWord.charAt(0) == 'i' ||
            englishWord.charAt(0) == 'o' || englishWord.charAt(0) == 'u'))
            System.out.println(englishWord + "yay");
            else
            System.out.println(englishWord +"ay");
            
        }
    }
}
