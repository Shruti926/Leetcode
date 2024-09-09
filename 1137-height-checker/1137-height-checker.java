class Solution {
    public int heightChecker(int[] heights) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<heights.length; i++)
        {
            max = Math.max(heights[i], max);
        }
        int array[] = new int[max+1];
        for(int i = 0; i<heights.length; i++)
        {
            array[heights[i]]++;
        }
        int expected[] = new int[heights.length];
        int j = 0;
        for(int i = 0; i<array.length; i++)
        {
            while(array[i] > 0)
            {
                expected[j] = i;
                array[i]--;
                j++;
            }
        }

        int count = 0;
        for(int i = 0; i<expected.length; i++)
        {
            if(heights[i] != expected[i])
            {
                count++;
            }
        }
    return count;
    }
}