class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<>();
        int start_row = 0;
        int end_row = matrix.length-1;
        int start_column = 0;
        int end_column = matrix[0].length-1;
        while((start_row <= end_row) && (start_column <= end_column))
        {
            //top
            for(int i = start_column ; i<= end_column ; i++)
            {
                spiral.add(matrix[start_row][i]);
            }
            //right
            for(int j = start_row+1; j<=end_row; j++)
            {
                spiral.add(matrix[j][end_column]);
            }
            //bottom
            for(int i = end_column-1; i>=start_column; i--)
            {
                if(start_row == end_row)
                {
                    break;
                }
                spiral.add(matrix[end_row][i]);
            }
            //left
            for(int j = end_row-1; j>=start_row+1; j--)
            {
                if(start_column == end_column)
                {
                    break;
                }
                spiral.add(matrix[j][start_column]);
            }
            start_row++;
            end_row--;
            start_column++;
            end_column--;
        }
        return spiral;
    }
}