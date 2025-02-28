public class Diagonal_Sum {
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;

        // THIS IS NOT OPTIMIZED METHOD TIME COMPLEXITY O(N^2)
        // for(int i = 0; i < matrix.length; i++) {
        //     for(int j = 0; j < matrix.length; j++) {
        //         //PD
        //         if(i == j) {
        //             sum += matrix[i][j];
        //         }+
        //         else if (i+j == matrix.length-1) {
        //             sum += matrix[i][j];
        //         } 
        //     }
        // }
        // return sum;


        //OPTIMIZED METHOD TC : O(N)
        for(int i = 0; i < matrix.length; i++) {
            //pd
            sum += matrix[i][i];
            // condition for removing Overlaping element from SD
            if (i != matrix.length-i-1) {  // matrix.length-i-1  == j
                sum += matrix[i][matrix.length-i-1];
            }
        }

        return sum;

    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};

        System.out.println( "Sum of diagonal is : " + diagonalSum(matrix));                  
    }
}
