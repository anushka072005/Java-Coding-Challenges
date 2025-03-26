public class TransposeMatrix {

    public static void Transposematrix(int matrix[][]) {
        int row = matrix.length, col = matrix[0].length;

        int transpose[][] = new int[col][row];

        // Compute transpose
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];   // Swap row and column
            }    
        }

        // Print Transposed Matrix
        System.out.println("Transposed Matrix : ");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }        
    }
    public static void main(String[] args) {
        int[][] matrix = { {2,3,7}, 
        {5,6,7} };

        int row = matrix.length, col = matrix[0].length;

        System.out.println("Original Matrix : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

        Transposematrix(matrix);                  
    }
}
