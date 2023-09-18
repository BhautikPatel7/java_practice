package twoDarrays;

public class spiralmatrix {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
                        printspiral(matrix);
    }

    public static void printspiral(int matrix[][]){
        int startrow = 0;
        int startcol = 0; 
        int endrow = matrix.length - 1;
        int endcol = matrix[0].length - 1;

        while (startrow <= endrow && startcol <= endcol)  {
            //top
            for (int j =  startcol; j <= endcol; j++) {
                System.out.print(matrix[startrow][j] + " ");
            }
            //Right
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(matrix[i][endrow] + " ");
            }
            // Bottom 
            for (int j = endcol - 1; j >= startcol; j--) {
                if (startrow == endrow) {
                    break;
                }
                System.out.print(matrix[endrow][j] + " ");
            }
            // left
            for (int i = endrow - 1; i >= startrow + 1; i--) {
                if (startcol == endcol) {
                    break;
                }
                System.out.print(matrix[i][startcol] + " ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
        System.out.println();
    }
}