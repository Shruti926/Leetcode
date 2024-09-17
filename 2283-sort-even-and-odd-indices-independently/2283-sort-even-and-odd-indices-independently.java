class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int even[] = new int[(nums.length+1)/2];
        int odd[] = new int[nums.length/2];
        int j = 0;
        int k = 0;
        for(int i = 0; i<nums.length; i++)
        {
            if(i%2 == 0)
            {
                even[j] = nums[i];
                j++;
            }
            else{
                odd[k] = nums[i];
                k++;
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        j = 0;
        k = odd.length-1;
        for(int i = 0; i<nums.length; i++)
        {
            if(i%2 == 0)
            {
                nums[i] = even[j];
                j++;
            }
            else{
                nums[i] = odd[k];
                k--;
            }
        }
        return nums;
    }
}