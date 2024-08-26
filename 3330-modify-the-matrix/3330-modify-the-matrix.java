class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int arr[] = new int[n];
        for(int i = 0; i<n; i++)
        {
            int max = Integer.MIN_VALUE;
            for(int j = 0; j<m; j++)
            {
               max = Math.max(max, matrix[j][i]);
            }
            arr[i] = max;
        }
        int answer[][] = new int[m][n];
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<m; j++)
            {
                if(matrix[j][i] == -1)
                {
                    answer[j][i] = arr[i];
                }
                else{
                    answer[j][i] = matrix[j][i];
                }
            }
        }
        return answer;
    }
}