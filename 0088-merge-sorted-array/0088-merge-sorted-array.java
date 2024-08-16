class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        while(i< m+n)
        {
            if(nums1[i] == 0 && j<n)
            {
                nums1[i] = nums2[j];
                i++;
                j++;
            }
            else{
            i++;
            }
        }
        Arrays.sort(nums1);
    }
}