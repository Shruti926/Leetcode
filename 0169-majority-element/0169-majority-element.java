class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> majority = new HashMap<>();
        for(int num : nums)
        {
            majority.put(num, majority.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : majority.entrySet())
        {
            if(entry.getValue() > n/2)
            {
                return entry.getKey();
            }
        }
        return 0;
    }
}