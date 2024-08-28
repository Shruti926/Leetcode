class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int i = s.length()-1;
        while(i >= 0 && s.charAt(i) == ' ')
        {
            i--;
        }
         if(i<0)
        {
            return  0;
        }
        while(i >= 0 && s.charAt(i) != ' ')
        {
            count++;
            i--;
        }
        return count;
    }
}