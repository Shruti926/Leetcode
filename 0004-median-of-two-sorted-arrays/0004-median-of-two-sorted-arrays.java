class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        double median  = 0;
        int arr[] = new int[n+m];
        for(int i = 0; i<n; i++)
        {
            arr[i] = nums1[i];
        }
        for(int i =n, j =0;  j<m; i++, j++)
        {
            arr[i] = nums2[j];
        }
        for(int i = 0; i<arr.length - 1; i++)
        {
            for(int j= 0; j<arr.length-1-i;j++ )
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        int x = m+n;
        if(x%2 == 0)
        {
            median  = (arr[x/2]+arr[x/2 - 1])/2.0;
        }
        else
        {
           median  = arr[x/2]; 
        }
        return median;
    }
}