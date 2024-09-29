class Solution {
    public int[] leftRightDifference(int[] nums) {
     int left[] = new int[nums.length];
     left[0] = 0;
     int right[] = new int[nums.length];
     right[right.length-1] = 0;
     int answer[] = new int[nums.length];
     for(int i = 1; i<nums.length; i++)
     {
        left[i] = left[i-1]+nums[i-1]; 
     } 
     for(int i = right.length - 2; i>=0; i--)
     {
        right[i] = right[i+1] + nums[i+1];
     }  
     for(int i = 0; i<answer.length; i++)
     {
        answer[i] = Math.abs(left[i] - right[i]);
     }
     return answer;
    }
}