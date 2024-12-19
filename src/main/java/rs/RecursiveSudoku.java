package rs;

public class RecursiveSudoku {

     private boolean isSafe(int[][] board, int row, int col, int x){
         // TODO make public static instead?

        // checking if x is present in this row
        for (int i = 0; i < board[row].length; i++){
            if (board[row][i] == x) {
                return false;
            }
        }

        // checking if x is present in this column
        for (int j = 0; j < board.length; j++){
            if (board[j][col] == x) {
                return false;
            }
        }

        // checking if x is present in box
        int boxSize = (int) Math.sqrt(board.length);
        int rowStart = row - row % boxSize;
        int colStart = col - col % boxSize;

        for (int r = rowStart; r < rowStart + boxSize; r++){
            for (int c = colStart; c < colStart + boxSize; c++){
                if (board[r][c] == x){
                    return false;
                }
            }
        }

        // no clash found: safe!
        return true;
    }



}
