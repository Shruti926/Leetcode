class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m+n];
        int i = 0;
        int j = 0;
        int z = 0;
        while(i<m && j<n)
        {
            if(nums1[i] <= nums2[j]){
                arr[z++] = nums1[i++];
            }
            else{
                arr[z++] = nums2[j++];
                
            }
            
        }
        while(i < m){
            arr[z++] = nums1[i++];
        }
        while(j < n){
            arr[z++] = nums2[j++];
        }
        z = 0;
        for(i = 0; i<m+n; i++){
            nums1[i] = arr[z++];
        }
    }
}