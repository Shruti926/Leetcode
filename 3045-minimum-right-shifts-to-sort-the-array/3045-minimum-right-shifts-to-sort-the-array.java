class Solution {
        public int minimumRightShifts(List<Integer> nums) {
        int count = 0;
        
        while(count < nums.size())
        {
            boolean issorted = true;
                for(int i =0; i<nums.size() - 1; i++)
                {
                    if(nums.get(i) > nums.get(i+1))
                    {
                        issorted = false;
                        break;
                    }
                }
                if(issorted)
                {
                    return count;
                }
                
            else{
                int temp = nums.get(nums.size() - 1);
                for(int i = nums.size() - 2; i>=0; i--)
                {
                    nums.set((i+1)%nums.size(), nums.get(i));
                }
                nums.set(0,temp);
                count++;
            }
        }
        return -1;
    }
}