import java.util.Arrays;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        if (sudoku(board)) {
            display(board);
        } else {
            System.out.println("Cannot solve");
        }

    }

    static boolean sudoku(int[][] board){

        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0){
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            if(!emptyLeft){
                break;
            }
        }
        if(emptyLeft){
            return true;
        }

        for (int i = 1; i <= 9 ; i++) {
            if (isSafe(board,row,col,i)){
                board[row][col] = i;
                if (sudoku(board)){
                    return true;
                }
                else{
                    board[row][col] = 0; // backtrack
                }
            }
        }
        return false;
    }

    private static void display(int[][] board) {
        for (int[] row : board){
            for(int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(int[][] board , int row , int col , int num){

        // check the row
        for (int i = 0; i < board.length; i++) {
            if (board[row][col] == num){
                return false;
            }
        }

        // check the column
        for (int[] nums : board) {
            if (nums[col] == num){
                return false;
            }
        }

        // check the 3x3 matrix
        int sqrt = (int)(Math.sqrt(board.length));

        int rowStart = row - row%sqrt; // row start
        int colStart = col - col%sqrt; // col start


        for (int r = rowStart; r < rowStart+sqrt; r++) {
            for (int c = colStart; c < colStart+sqrt; c++) {
                if (board[r][c] == num){
                    return false;
                }
            }
        }
        return true;
    }

}
