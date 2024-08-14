class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        List<Integer> arr =  new ArrayList<Integer>();
        int s = m - 1+ n-1;
        for(int sum = 0; sum<=s; sum++)
        {
           if(sum%2 == 0)
           {
            for(int i = m-1; i>=0; i--)
            {
                for(int j = 0; j<n; j++)
                {
                    if(i+j == sum)
                    {
                        arr.add(mat[i][j]);
                    }
                }
            }
           }
           else{
            for(int i = 0; i<m; i++)
            {
                for(int j = n-1; j>=0; j--)
                {
                    if(i+j == sum)
                    {
                        arr.add(mat[i][j]);
                    }
                }
            }
           }
        }
        int result[] = new int[arr.size()];
        for(int i = 0; i< arr.size(); i++)
        {
            result[i] = arr.get(i);
        }
         return result;
    }
}