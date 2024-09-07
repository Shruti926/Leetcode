class Solution {
    public int smallestEvenMultiple(int n) {
        for(int i = 1; i<=2; i++)
        {
            int num = n*i;
            if(num%2 == 0)
            {
                return num;
            }
        }
        return -1;
    }
}