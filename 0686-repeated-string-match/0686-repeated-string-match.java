class Solution {
    public int repeatedStringMatch(String a, String b) {
        String result =  new String("");
       for(int i = 0; i<= b.length()/a.length()+2; i++)
       {
        result = a.repeat(i);
        if(result.length()>=b.length())
        {
            for(int j = 0; j<=result.length() - b.length(); j++)
            {
                if(b.equals(result.substring(j,j+b.length())))
                {
                    return i;
                }
            }
        }
       }
       return -1; 
    }
}