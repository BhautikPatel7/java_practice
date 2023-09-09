package patternquestions;

public class onezeropatter {
    public static void main(String[] args) {
        patter(9);
    }

    private static void patter(int n) {
        for (int i  = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
               if ((i+j) % 2 == 0) {
                System.out.print("1");
                
               } else {
                System.out.print("0");
               }                
            }
            System.out.println();
        }
    }
    
}
