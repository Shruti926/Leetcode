class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int k = 0;
        for(int i = 0; i<nums1.length; i++)
        {
            k^=nums1[i];
        }
        int x = 0;
        
        for(int i = 0; i<nums2.length; i++)
        {
            x^=nums2[i];
        }
        return ((nums1.length%2 *x)^(nums2.length%2*k));
    }
}