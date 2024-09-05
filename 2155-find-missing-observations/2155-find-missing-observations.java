class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int arr[] = new int[n];
        int sum;
        sum = mean*(rolls.length + n);
        for(int i = 0; i<rolls.length; i++)
        {
            sum -= rolls[i];
        }
        if(sum < n || sum > 6*n)
        {
            return new int[0];
        }
        else{
            int avg = sum/n;
            int remainder = sum%n;
            for(int i = 0; i<n; i++)
            {
                arr[i] = avg + (i<remainder?1:0);
            }
        }
        return arr;
    }
}