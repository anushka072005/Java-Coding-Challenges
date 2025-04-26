// Find There is Posiible Solution exist or not (if exist then print Single solution)
public class NQueensForSingleSolu {
    public static boolean isSafe(char board[][], int row, int col) {
        // Vertical up
        for(int i=row-1; i>=0; i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        // Digo left
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        //  Digo right
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static boolean nQueens(char board[][], int row) {
        // Base case
        if(row == board.length) {
            // printBoard(board);
            return true;
        }
        // Recursion call
        // column loop
        for(int j=0; j<board.length; j++) {
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if(nQueens(board, row+1)) {
                    return true;
                }
                board[row][j] = 'X';  // unplace (BackTracking)
            }
        }
        return false;
    }

    public static void printBoard(char board[][]) {
        System.out.println("------cheese board------");
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 6;
        char board[][] = new char[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = 'X';
            }
        }
        if(nQueens(board, 0)) {
            System.out.println("Solution is possible"); 
            printBoard(board);
        }
        else {
            System.out.println("Solution is not possible");
        }

    }
}