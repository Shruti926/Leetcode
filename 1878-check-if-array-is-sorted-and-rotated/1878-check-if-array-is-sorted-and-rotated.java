class Solution {
    public boolean check(int[] nums) {
        int x = 0;
        for(int i = 0; i<nums.length-1; i++)
        {
            if(nums[i] > nums[i+1])
            {
                x = i+1;
            }
        }
        int new_nums[] = new int[nums.length];
        for(int i = 0; i<nums.length; i++)
        {
            new_nums[i] = nums[(i+x)%nums.length];  
        }
        for(int i = 0; i<nums.length-1; i++)
        {
            if(new_nums[i] > new_nums[i+1])
            {
                return false;
            }
        }
        return true;
    }
}