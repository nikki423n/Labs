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
        char[] vowels = {'a','e', 'i', 'o', 'u'};
        
        int vowelIndex = 100; //if no woel, vowel index = 100
        boolean hasVowel = true;
        int length = englishWord.length();
              for (int i = 0; i < length; i++)
        {
            if (vowelIndex ==0)
            {
                hasVowel = false;
                break;
            }
        }
        if (hasVowel)
            System.out.println(englishWord +"ay");
        else
            System.out.println(englishWord +"yay" );
    }
}
            
        
        