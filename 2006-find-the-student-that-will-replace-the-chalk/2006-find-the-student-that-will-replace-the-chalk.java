class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int replace = 0;
        while( k >= 0)
        {
            for(int i = 0; i < chalk.length; i++)
            {
                if(k < chalk[i])
                {
                    return i;
                }
                k -= chalk[i];
            }
        }
        return -1;
    }
}