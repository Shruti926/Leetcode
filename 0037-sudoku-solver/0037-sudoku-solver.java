class Solution {
    public static boolean isSafe(char[][] board, int row, int col, char digit)
    {
        for(int i = 0; i<9; i++)
        {
            if(board[row][i] == digit)
            {
                return false;
            }
            if(board[i][col] == digit)
            {
                return false;
            }
        }
            int startrow = (row/3)*3;
            int startcol = (col/3)*3;
            for(int i = 0; i<3; i++)
            {
                for(int j = 0; j<3; j++)
                {
                    if(board[startrow+i][startcol+j] ==  digit)
                    {
                        return false;
                    }
                }
            }
        return true;
    }
    public static boolean sudoku(char[][] board, int row, int col)
    {
        if(row == 9)
        {
            return true;
        }
        if(col == 9)
        {
            return sudoku(board, row+1, 0);
        }
        if(board[row][col] != '.')
        {
            return sudoku(board, row, col+1);
        }
        for(char i = 1; i<=9; i++)
        {
            char digit = (char)('0'+i);
            if(isSafe(board, row, col, digit))
            {
                board[row][col] = digit;
                if(sudoku(board, row, col+1))
                {
                    return true;
                }
                else{
                    board[row][col] = '.';
                }
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        sudoku(board,0,0);
    }
}