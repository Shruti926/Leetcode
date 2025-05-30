public class Solution{
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int target = 0;
       System.out.println(returnPivot(nums));
       search(nums,target);
    }
     
    public static int search(int[] nums, int target) {
        int pivot = returnPivot(nums);
        if(pivot==-1){
           return binarySearch(nums, target, 0, nums.length-1);
        }
        if(nums[pivot]==target){
            return pivot;
        }
        if(target>= nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }
       return  binarySearch(nums, target, pivot+1, nums.length-1);
       
    }
    public static int binarySearch(int nums[],int target,int first, int last){
        while(first<=last){
            int mid = first+(last-first)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<=target){
                first = mid+1;
            }
            else{
                last = mid-1;
            }
        }
        return -1;
    }
    public static int returnPivot(int nums[]){
        int start = 0;
        int last = nums.length-1;
        while(start <= last){
            int mid = start +(last-start)/2;
            if(mid<last&&nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>start&&nums[mid-1]>nums[mid]){
                return mid-1;
            }
            if(nums[start]>=nums[mid]){
                last= mid-1;
            }
            else{
                start= mid+1;
            }
        }
        return -1;
    }
}