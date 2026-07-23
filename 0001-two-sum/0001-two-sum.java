class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        boolean sol = false;
        int n  = nums.length;
        for(int i = 0; i<n; i++){
            for (int j = i+1; j<n; j++){
                if(nums[i]+nums[j] == target){
                    index[0]= i;
                    index[1] = j;
                    sol = true;
                    break;
                }
                if(sol)break;
            }
        }
        return index;
    }
}