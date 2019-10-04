public class PigLatin
{
    private String pigword;

    public PigLatin()
    {
        pigword = "";
    }

    public void convert(char [] userInput)
    {
        // Search for non letter
        int aIndex=-1, bIndex=0;

        for (int i=0; i < userInput.length; i++)
        {
            aIndex = -1;
            char c = userInput[i];
            if (c == ' ' || c == ',' || c == '.' || c == '?' || c == ';' || c == ':' ||
            c == '-' || c == '"' || c == '(' || c == ')' )
            {
                aIndex = i;

                pigword = pigword + convertword(userInput, bIndex, aIndex);

                pigword = pigword + userInput[i];

                bIndex = aIndex + 1;
            }

        }

        if (aIndex == -1)
        {
            pigword = pigword + convertword(userInput, bIndex, userInput.length);
        }
    }

    public String convertword(char [] userInput, int bIndex, int aIndex)
    {
        String str = "";
        char c = Character.toLowerCase(userInput[bIndex]);

        for (int i = bIndex; i < aIndex; i++)
            str = str + userInput[i];

        if (c < 'a' || c > 'z' )
            return str;

        if (!containVowel(str))
        {
            str = str + "ay";
        }
        else
        {
            char ch = Character.toLowerCase(str.charAt(0));
            boolean firstCap = false;

            if (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z')
            {
                firstCap = true;
            }

            if (isVowel(ch))
                str = str + "yay";
            else
            {
                int indexLoc = findVowel(str);
                String start = str.substring(0, indexLoc);
                String end = str.substring(indexLoc);

                if (firstCap)
                {
                    end = Character.toUpperCase(end.charAt(0)) + end.substring(1);
                    start = Character.toLowerCase(start.charAt(0)) + start.substring(1,indexLoc);
                    str = end + start + "ay";
                }
                else
                {
                    str = end + start + "ay";
                }
            }
        }

        return str;
    }

    public int findVowel(String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            char c = Character.toLowerCase(str.charAt(i));

            if (isVowel(c))
                return i;
        }

        return 0;
    }

    public boolean isVowel(char c)
    {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            return true;
        else
            return false;
    }

    public boolean containVowel(String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            char c = Character.toLowerCase(str.charAt(i));

            if (isVowel(c))
                return true;
        }

        return false;
    }

    public void printOutput()
    {
        System.out.println("The pig Latin word word be : ");
        System.out.println(pigword);
    }
}