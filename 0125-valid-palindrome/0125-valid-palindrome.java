class Solution {
    public boolean isPalindrome(String s) {
        String s2 = s.toLowerCase();
        s2 = s2.replaceAll("[^a-z0-9]","");
        for(int i =0; i<s2.length()/2; i++)
        {
            if(s2.charAt(i) != s2.charAt(s2.length()-1-i))
            {
                return false;
            }
        }
        return true;
    }
}