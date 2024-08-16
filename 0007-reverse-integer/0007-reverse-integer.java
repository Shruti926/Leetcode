class Solution {
    public int reverse(int x) {
        int digit = 0;
        int number = 0;
        boolean isNegative = x<0;
        if(isNegative)
        {
            x = -x;
        }
        while(x != 0)
        {
            digit = x%10;
            if(number > (Integer.MAX_VALUE - digit)/10)
            {
                return 0;
            }
            number = number*10 + digit;
            x = x/10;
        }
        if(isNegative)
        {
            number = -number;
        }
        return number;
    }
}