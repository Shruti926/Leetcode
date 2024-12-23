class Solution {
    public int search(int[] nums, int target) {
        int left  = 0;
        int mid =0;
        int right = nums.length -1;
        while(left <= right)
        {
           mid = (left +right )/2;
            if(nums[mid] == target)
            {
                return  mid;
            }
            else if(target > nums[mid])
            {
                left = mid+1;
            }
            else 
            {
                right = mid -1;
            }
           
        }
        return -1;
    }
}