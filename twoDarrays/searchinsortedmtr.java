package twoDarrays;

public class searchinsortedmtr {
    public static void main(String[] args) {
        int key = 1 ;
        int matrix[][] = { { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 },
        { 13, 14, 15, 16 } };
        search( matrix,key);
    }
    public static void search(int matrix[][],int key){
        //time complexity o(n^2)
        //First approch
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix.length; j++) {
        //         if (matrix[i][j] == key ) {
        //             System.out.println(i + "," + j);
        //         }
        //     }
        // }
            
        // for (int i = 0; i < matrix.length; i++) {
            //Wrost case Time Complexity is O(n+m)
            int row = 0, col = matrix[0].length-1;
            while (row < matrix.length && col >= 0) {
             if (matrix[row][col ] == key) {
                System.out.println(row + "," + col);
                break;
             }   

             else if (key < matrix[row][col]) {
                col--;
             }
             else if(key > matrix[row][col]){
                row++;
             }
             else{
                 System.out.println("Key Dose Not Exists");
            }
           //  }
             
           
        }

    }
}
