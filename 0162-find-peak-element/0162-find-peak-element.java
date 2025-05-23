class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end  = nums.length - 1;
        if(nums.length == 1)
        {
            return 0;
        }
        while(start < end)
        {
            int mid = start + (end-start)/2;
            if ((mid == 0 || nums[mid] > nums[mid - 1]) && 
                (mid == nums.length - 1 || nums[mid] > nums[mid + 1])) {
                return mid; // Found peak
            } else if (mid < nums.length - 1 && nums[mid] < nums[mid + 1]) {
                start = mid + 1; // Search right
            } else {
                end = mid; // Search left
            }
        }
        return start;
    }
}