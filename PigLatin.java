 
public class PigLatin
{
    private String translation;
    char [] vowels = new char[5];
 
    public PigLatin()
    {
       translation = "";
    }
   
    void reset()
    {
        translation = "";
    }
 
    public void convert(String user_word)
    {
        // Search for non letter
        int eindex=-1, sindex=0;
 
        for (int i=0; i < user_word.length(); i++)
        {
            eindex = -1;
            if (user_word.charAt(i) == ' ' || user_word.charAt(i) == ',' ||
            user_word.charAt(i) == '.' || user_word.charAt(i) == '?' ||
            user_word.charAt(i) == ';' || user_word.charAt(i) == ':' ||
            user_word.charAt(i) == '-' || user_word.charAt(i) == '"' ||
            user_word.charAt(i) == '(' || user_word.charAt(i) == ')' )
            {
                eindex = i;
 
                translation = translation + convertword(user_word, sindex, eindex);
 
                translation = translation + user_word.charAt(i);
 
                sindex = eindex + 1;
            }
 
        }
       
        if (eindex == -1)
        {
            translation = translation + convertword(user_word, sindex, user_word.length());
        }
    }
 
    public String convertword(String user_word, int sindex, int eindex)
    {
        String tempString = "";
 
        if (Character.toLowerCase(user_word.charAt(sindex)) < 'a' ||
        Character.toLowerCase(user_word.charAt(sindex)) > 'z' )
        {
            tempString = tempString + user_word.substring(sindex, eindex);
            return tempString;
        }
 
        tempString = user_word.substring(sindex, eindex);
 
        if (!containVowel(tempString))
        {
            tempString = tempString + "ay";
        }
        else
        {
            char c = Character.toLowerCase(tempString.charAt(0));
            boolean firstCap = false;
           
            if (tempString.charAt(0) >= 'A' && tempString.charAt(0) <= 'Z')
            {
                firstCap = true;
            }
           
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                tempString = tempString + "yay";
            else
            {
                int indexLoc = findVowel(tempString);
                String start = tempString.substring(0, indexLoc);
                String end = tempString.substring(indexLoc);
               
                if (firstCap)
                {
                    end = Character.toUpperCase(end.charAt(0)) + end.substring(1);
                    start = Character.toLowerCase(start.charAt(0)) + start.substring(1,indexLoc);
                    tempString = end + start + "ay";
                }
                else
                {
                    tempString = end + start + "ay";
                }
            }
        }
 
        return tempString;
    }
   
    public int findVowel(String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            char c = Character.toLowerCase(str.charAt(i));
           
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                return i;
        }
       
        return 0;
    }
 
    public boolean containVowel(String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            char c = Character.toLowerCase(str.charAt(i));
 
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                return true;
        }
 
        return false;
    }
    
    void printOutput()
    {
        System.out.println("The pig Latin word word be : ");
        System.out.println(translation);
    }
}
 
