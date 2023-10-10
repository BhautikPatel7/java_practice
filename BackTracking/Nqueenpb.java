package BackTracking;

public class Nqueenpb {
    static int count = 0;
    public static void main(String[] args) {
        

        //Time Complexity O(n!)
    int n = 4;
    char board[][]  =  new char[n][n];
        //Initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
       if (nQueen(board,0)) {
        System.out.println("Solution is Possible");
        printboard(board);
       } else{
        System.out.println("Solution Is Not Possible");
       }
        System.out.println("Total Ways TO solve N qeen Problem" + "  "+count);
       
    }

    public static boolean nQueen(char[][] board, int row) {
        //Base Casse
        if (row==board.length) {
           // printboard(board);
           count++;
            return true;
        }
        for (int j = 0; j < board.length; j++) {
            if(issafe(board,row,j)){
                board[row][j] = 'q';
            if(nQueen(board, row+1)){
                return true;
            };
            board[row][j] = 'X';//BackTracking
            }
            
        }
        return false;
    }

    private static boolean issafe(char[][] board, int row, int col) {
        //vertical up
        for (int i = row-1; i >= 0; i--) {
            if (board[i][col] == 'q') {
                return false;
            }
        }
        //Digonal Left up
        for (int i = row-1, j= col-1; i >= 0 && j >= 00; i--,j--) {
            if (board[i][j] == 'q') {
                return false;
            }
        }
        //Digonal Right up
        for (int i = row-1, j= col+1; i >= 0 && j<board.length ; i--,j++) {
            if (board[i][j] == 'q') {
                return false;
            }
        }
         
        return true;
    }

    public static void printboard(char[][] board) {
        System.out.println("_____Chess Board_____");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

}
