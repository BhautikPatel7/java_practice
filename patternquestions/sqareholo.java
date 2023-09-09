package patternquestions;

public class sqareholo {
    public static void main(String[] args) {
        printpp(4, 5);
        
    }
    public static void printpp(int rows,int colum ){
        for (int i = 0; i <= rows - 1;i++) {
            for (int j = 0; j <= colum -1 ; j++) {
                if (i == 0 || i == rows - 1 || j == 0|| j == colum - 1) {
                    System.out.print("*");
                    
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
            
        }
    }
    
}
