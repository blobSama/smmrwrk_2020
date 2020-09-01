public class blocks
{
    public static String smallestLet(String str)
    {
        String ansStr = "", currStr = "";
        int min = 0;
        while(str.indexOf("#") != -1)
        {
            currStr = "";
            for(int i = 0; i < str.indexOf("#"); i++)
            {
                currStr = str.substring(0, str.indexOf("#"));
            }
            for(int i = 0; i < currStr.length(); i++)
            {
                if(currStr.charAt(i) < currStr.charAt(min))
                {
                    min = i;
                }
            }
            ansStr = ansStr + str.charAt(min) + "#";
            str = str.substring((str.indexOf("#") + 1));
        }
        min = 0;
        for(int i = 0; i < str.length();i++)
        {
            if(str.charAt(i) < str.charAt(min))
            {
                min = i;
            }
        }
        ansStr = ansStr + str.charAt(min) + "#";
        return ansStr;
    }
    
    public int numOfStarts(String[] strArr, char ch)
    {
        int cntr = 0;
        for(int i = 0; i < strArr.length; i++)
        {
            strArr[i] = smallestLet(strArr[i]);
        }
        
        for(int i = 0; i < strArr.length; i++)
        {
            if(strArr[i].charAt(0) == ch)
                cntr++;
        }
        return cntr;
    }
}
