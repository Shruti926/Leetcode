class Solution {
    public int hIndex(int[] citations) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<citations.length; i++)
        {
            largest = Math.max(largest, citations[i]);
        }
        int count[] = new int[largest+1];
        for(int i = 0; i<citations.length; i++)
        {
            count[citations[i]]++;
        }
         int  j = 0;
        for(int  i = 0; i<count.length; i++)
        {
           
            while(count[i] > 0)
            {
                citations[j] = i;
                j++;
                count[i]--;
            }
        }
        int hindex = 0;
         int h = 0;
        for(int i = 0; i<citations.length; i++)
        {
            h = citations.length - i;
           
            if(citations[i] >= h)
            {
               hindex = h;
               return hindex; 
            }
        }
        return 0;
    }
}