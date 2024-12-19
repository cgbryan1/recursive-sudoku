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

    // for this to work, board must have zero for empty cell!
    public static boolean solve(int[][] board, int size){
         // size = grid size, ex 9x9
         // holds location of first empty cell
         int eRow = -1;
         int eCol = -1;
         boolean isEmpty = true;

         for (int r = 0; r < board.length; r++){
             for (int c = 0; c < board[r].length; c++){
                 if (board[r][c] == 0){
                     eRow = r;
                     eCol = c;
                     isEmpty = false;
                     break;
                 }
             }
         }
         if (isEmpty){
             return true;
         }


    }



}
