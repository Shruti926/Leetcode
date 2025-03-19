class Solution {
    public static boolean isSafe(char[][] board, int row, int col, char digit)
    {
        for(int i = 0; i<9; i++)
        {
            if(board[row][i] == digit && i!= col)
            {
                return false;
            }
            if(board[i][col] == digit && i != row)
            {
                return false;
            }
        }
        int startrow = row - (row%3);
        int startcol = col - (col%3);
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                if(board[startrow+i][startcol+j] == digit && (startrow+i)!= row && (startcol+j)!= col)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean soduko(char[][] board, int row, int col)
    {
        if(row == 9)
        {
            return true;
        }
        if(col == 9)
        {
            return soduko(board, row+1, 0);
        }
        if(board[row][col] == '.')
        {
           return soduko(board, row, col+1);
        }

        for(int i = 0; i<board.length; i++)
        {
            char digit = board[row][i];
           if(isSafe(board, row, col, digit))
           {
            return soduko(board, row, col+1);
           }
        }
        return false;
    }
    public boolean isValidSudoku(char[][] board) {
        return soduko(board, 0,0);
    }
}