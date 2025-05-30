import java.util.*;

public class LuckyNumInmatrix {
    public static List<Integer> luckyNumber(int matrix[][]) {
        ArrayList<Integer> res = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;

        for(int i=0; i<row; i++) {
            int minCol = 0; // Find min in the row
            for(int j=1; j<col; j++) {
                if(matrix[i][j] < matrix[i][minCol]) {
                    minCol = j;
                }
            }

            int minValue = matrix[i][minCol]; // store minval
            boolean isMaxInCol = true;
            // Check if it's max in the column
            for(int k=0; k<row; k++) {
                if(matrix[k][minCol] > minValue) {
                    isMaxInCol = false;
                    break;
                }
            }

            if (isMaxInCol) res.add(minValue);
        }
        return res;
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {3, 7, 8},
            {9, 11, 13},
            {15, 16, 17}
        };
        System.out.println(new LuckyNumInmatrix().luckyNumber(matrix));
    }
}
