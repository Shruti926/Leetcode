class Solution {
    public int[] productExceptSelf(int[] nums) {
        boolean haszero = false;
        int product = 1;
        int count = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == 0){
                haszero = true;
                count++;
            }
            else{
                product*=nums[i];
            }
        }

        int[] answer = new int[nums.length];
        
        if(haszero && count>1){
            return answer;
        }
        else if(haszero){
            for(int i = 0; i<nums.length; i++){
                if(nums[i] == 0){
                    answer[i] = product;
                }
            }
        }
        else{
            for(int i = 0; i<nums.length; i++){
                answer[i] = product/nums[i];
            }
        }
        return answer;
    }
}