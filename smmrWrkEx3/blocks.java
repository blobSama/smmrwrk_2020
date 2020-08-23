public class blocks
{
    public static int smallestLet(String str)
    {
        String ansStr = "", currStr = "";
        int cntr = 0;
        while(str.indexOf("#") != -1)
        {
            currStr = "";
            for(int i = 0; i < str.indexOf("#"); i++)
            {
                currStr = currStr + str.charAt(i);
            }
            int min = 0;
            for(int i = 0; i < currStr.length(); i++)
            {
                if(currStr.charAt(i) < currStr.charAt(min))
                {
                    min = i;
                }
            }
            ansStr = ansStr + currStr + "#";
            str = str.substring((str.indexOf("#") + 1));
        }
        return str.indexOf("#");
    }
    /.*
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
