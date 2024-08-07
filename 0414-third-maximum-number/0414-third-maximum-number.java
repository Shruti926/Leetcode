class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
            int  n = nums.length;
            int distinct = 1;
            int largest = nums[n-1];
           for(int i = n-1; i> 0; i--)
           {
              if(nums[i] != nums[i-1])
              {
                largest = nums[i-1];
                distinct++;
              }
              if(distinct == 3)
              {
                return largest;
              }
           }
     return nums[n-1];    
    }
}