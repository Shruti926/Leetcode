class Solution {
    public static boolean solve(int i, int j, int row, int col, char[][] board, int index, String word){
        if(index == word.length()){
            return true;
        }
        else if(i < 0 || j<0 || i>=row || j>= col || board[i][j] != word.charAt(index)){
            return false;
        }
        else{
            char temp = board[i][j];
            board[i][j] = '.';
            boolean up = solve(i-1,j, row, col, board,index+1, word);
            boolean down = solve(i+1, j, row, col, board, index+1, word);
            boolean left = solve(i, j-1, row, col, board, index+1, word);
            boolean right = solve(i, j+1, row, col, board, index+1, word);
            board[i][j] = temp;
            return up|| down|| left || right;
        }
    }
    public boolean exist(char[][] board, String word) {
        int index = 0;
        boolean ans = false;
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                if(board[i][j] == word.charAt(index)){
                    ans = solve(i, j, board.length, board[0].length, board, index, word);
                    if(ans)break;
                }
            }
            if(ans)break;
        }
        return ans;
    }
}