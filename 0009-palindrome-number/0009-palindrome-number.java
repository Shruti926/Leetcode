class Solution {
    public boolean isPalindrome(int x) {
        int copy=x;
        int rev=0;
        while(copy>0)
        {
            int d=copy%10;
            rev=rev*10+d;
            copy=copy/10;
        }
        if(rev==x)
        return true;
        else
        return false;
    }
}