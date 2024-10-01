class Solution {
    public boolean canArrange(int[] arr, int k) {
    int count[] = new int[k];
    for(int i = 0; i<arr.length; i++)
    {
       int remainder = (((arr[i]%k) + k)%k);
       count[remainder]++;
    }
    for(int i = 1; i<k; i++)
    {
        if(count[i] != count[k-i])
        {
            return false;
        }
    }
    if(count[0]%2 != 0)
    {
        return false;
    }
    if (k % 2 == 0 && count[k / 2] % 2 != 0) 
    {
        return false; // If k/2 is odd, can't form pairs
    }
    return true;
    }
}