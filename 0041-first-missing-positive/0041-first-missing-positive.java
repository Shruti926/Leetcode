class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int smallest = 1;
        for(int i = 0; i<nums.length; i++)
        {
            if(smallest == nums[i])
            {
                smallest++;
            }
        }
        return smallest;
    }
}