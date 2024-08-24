class Solution {
    public int findMin(int[] nums) {
        int rotation = 0;
        for(int i = 0; i<nums.length-1; i++)
        {
            if(nums[i]>nums[i+1])
            {
                rotation = i+1;
            }
        }
        if(rotation > 0)
        {
            return nums[rotation];
        }
        return nums[0];
    }
}