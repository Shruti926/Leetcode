class Solution {
    public int[] searchRange(int[] nums, int target) {
        int result[] = new int[2];
        result[0] = findfirst(nums,target);
        result[1] = findlast(nums, target);
        return result;
    }
    public static int findfirst(int nums[], int target)
    {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(nums[mid] == target)
            {
                result = mid;
                right = mid-1;
            }
            else if(nums[mid] > target)
            {
                right = mid - 1;
            }
            else 
            {
                left = mid+1;
            }
        }
        return result;
    }
     public static int findlast(int nums[], int target)
    {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(nums[mid] == target)
            {
                result = mid;
                left = mid+1;
            }
            else if(nums[mid] > target)
            {
                right = mid - 1;
            }
            else 
            {
                left = mid+1;
            }
        }
        return result;
    }
}