class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n];
        int sr = 0;
        int er = matrix.length - 1;
        int sc = 0;
        int ec = matrix[0].length - 1;
        int count = 1;
        while((sr<=er) && (sc<=ec))
        {
            //top
            for(int i = sc; i<= ec; i++)
            {
                matrix[sr][i] = count;
                count++;
            }
            //right
            for(int j = sr+1; j<=er; j++)
            {
                matrix[j][ec] = count;
                count++;
            }
            //bottom
            for(int i = ec-1; i>=sc; i--)
            {
                if(sr == er)
                {
                    break;
                }
                matrix[ec][i] = count;
                count++;
            }
            //left
            for(int j = er-1; j>= sr+1; j--)
            {
                if(sc == ec)
                {
                    break;
                }
                matrix[j][sc] = count;
                count++;
            }
            sr++;
            er--;
            sc++;
            ec--;
        }
    return matrix;
    }
}