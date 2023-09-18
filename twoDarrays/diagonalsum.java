package twoDarrays;

public class diagonalsum {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
                diogonalmatrixsum(matrix);
    }

    public static int diogonalmatrixsum(int matrix[][]){    //O(n^2 ) timecomplexity
        int sum = 0;
       // for (int i = 0; i < matrix.length ; i++) {
        //   //  System.out.print(i+1);
            
        //     for (int j = 0; j < matrix[0].length; j++) {
        //       //  System.out.print(j+1);
        //         if (i == j) {
        //             sum = sum + matrix[i][j];
        //            // System.out.println(sum);
        //         }
        //         else if (i+j == matrix.length - 1) {
        //             sum = sum + matrix[i][j];
        //         }
        //     }
        // }
        // System.out.println(sum);
        // return sum;

            for (int i = 0; i < matrix.length; i++) {
                //first digonal
                sum += matrix[i][i];
                //Second digonal
                if (i != matrix.length - i -1) {
                     sum  += matrix[i][matrix.length-i-1];
                }
               
            }
            System.out.println(sum);
            return sum;

    }
}
