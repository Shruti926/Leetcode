class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int min_a[] = new int[matrix.length];
        int max_a[] = new int[matrix[0].length];
        int index_r = 0;
        int index_c = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<matrix.length; i++)
        {
            int min = Integer.MAX_VALUE;
            for(int j = 0; j<matrix[0].length; j++)
            {
                min = Math.min(min, matrix[i][j]);
            }
            min_a[index_r] = min;
            index_r++;
        }
        for(int i = 0; i<matrix[0].length ; i++)
        {
            int max = Integer.MIN_VALUE;
            for(int j = 0; j<matrix.length; j++)
            {
                max = Math.max(max, matrix[j][i]);
            }
            max_a[index_c] = max;
            index_c++;
        }
        for(int i = 0; i<min_a.length; i++)
        {
            for(int j = 0; j<max_a.length; j++)
            {
                if(min_a[i] == max_a[j])
                {
                    list.add(min_a[i]);
                    break;
                }
            }
        }
        return list;
    }
}