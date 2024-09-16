class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr1.length; i++)
        {
            max = Math.max(arr1[i], max);
        }
        int count[] = new int[max+1];
        for(int i = 0; i<arr1.length; i++)
        {
            count[arr1[i]]++;
        }
        int answer[] = new int[arr1.length];
        int j = 0;
        for(int i = 0; i<arr2.length; i++)
        {
            while(count[arr2[i]] > 0)
            {
                answer[j] = arr2[i];
                count[arr2[i]]--;
                j++;
            }
        }
        for(int i = 0; i<count.length; i++)
        {
            while(count[i] > 0)
            {
                answer[j] = i;
                count[i]--;
                j++;
            }
        }
        return answer;
    }
}