class Solution {
    public int diagonalSum(int[][] mat) {
    int  n = mat.length;
    int sum = 0;
        for(int i = 0; i<n; i++)
        {
            //pd
            sum += mat[i][i];
            //sd
            if(i != n-i-1)
            {
                sum += mat[i][n-1-i];
            }
        }
    return sum;
    }
}