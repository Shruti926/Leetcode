class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int currentpos = 0;
        int farthest = 0;
        for(int i = 0; i<nums.length -1; i++)
        {
            farthest = Math.max(farthest, i+nums[i]);

            if(i == currentpos)
            {
                jumps++;
                currentpos = farthest;

                if(currentpos > nums.length -1)
                {
                    break;
                }
            }
        }
        return jumps;
    }
}