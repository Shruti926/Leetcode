class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr1[] = new int[n];
        int j = 0;
        for(int i = 0; i<n; i++)
        {
            arr1[i] = nums[j];
            j++;
        }
        int arr2[] = new int[n];
        for(int i = 0; i<n; i++)
        {
            arr2[i] = nums[j];
            j++;
        }
        int  x = 0, y = 0;
        for(int i = 0; i<2*n; i++)
        {
            if(i%2 == 0)
            {
                nums[i] = arr1[x];
                x++;
            }
            else{
                nums[i] = arr2[y];
                y++;
            }
        }
        return nums;
        }
    }
