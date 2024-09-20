class Solution {
    public int threeSumClosest(int[] nums, int target) {
    int min = Integer.MAX_VALUE;
    int difference = 0;
    int closest = 0;
    int n = nums.length;
    int sum = 0;
    for(int i = 0; i<n; i++)
    {
        for(int j = i+1; j<n;j++)
        {
            for(int k = j+1; k<n; k++)
            {
                sum = nums[i]+nums[j]+nums[k];
                difference = target - sum;
                if(difference < 0)
                {
                    difference*= -1;
                }
                min = Math.min(difference, min);
                if(min == difference)
                {
                    closest = sum;
                }
            }
        }
    }
    return closest;
    }
}