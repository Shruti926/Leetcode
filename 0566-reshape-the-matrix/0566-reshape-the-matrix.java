class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
    int nums[][] = new int[r][c];
    int m = mat.length;
    int n = mat[0].length;
    int row =0;
    int col = 0;
    if(m*n != r*c)
    {
        return mat;
    }
    for(int i = 0; i<m; i++)
    {
        for(int j = 0; j<n; j++)
        {
            nums[row][col] = mat[i][j];
            col++;
            if(col==c)
                {
                    row++;
                    col = 0;
                }
        }
    }
    return nums;
    }
}