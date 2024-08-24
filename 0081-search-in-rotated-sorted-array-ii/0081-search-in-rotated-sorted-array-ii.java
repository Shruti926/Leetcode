class Solution {
    public boolean search(int[] nums, int target) {
        int pivot = 0;
        for(int i = 0; i<nums.length-1; i++)
        {
            if(nums[i]> nums[i+1])
            {
                pivot = i+1;
            }
        }
        int left = 0;
        int right = nums.length - 1;
        if(target >= nums[pivot] && target<=nums[right])
        {
            left = pivot;
        }
        else{
            right = pivot - 1;
        }
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(nums[mid] == target)
            {
                return true;
            }
            else if(nums[mid] > target)
            {
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
    return false;
    }
}