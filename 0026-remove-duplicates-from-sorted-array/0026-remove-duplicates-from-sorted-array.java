class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int j  = 0;
        int z = 1;
        for(int i = 1; i<nums.length; i++){
            if(nums[j] != nums[i]){
                count++;
                nums[z] = nums[i];
                z++;
                j = i;
            }
        }
        return count;
    }
}