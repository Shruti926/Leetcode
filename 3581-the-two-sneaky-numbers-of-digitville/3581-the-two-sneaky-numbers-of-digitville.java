class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int arr[] = new int[2];
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++)
        {
            max = Math.max(max, nums[i]);
        }
        int count[] = new int[max+1];
        for(int i = 0; i<nums.length; i++)
        {
            count[nums[i]]++;
        }
        int j = 0;
        for(int i = 0; i<count.length; i++)
        {
            if(count[i] == 2)
            {
                arr[j] = i;
                j++;
            }
            if(j == 2)
            {
                break;
            }
        }
        return arr;
    }
}