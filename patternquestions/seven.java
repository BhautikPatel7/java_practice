package patternquestions;

public class seven {
    public static void main(String[] args) {
        pattern(5);
    }
    
    
    private static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            
            }
             for (int j = 1; j <=i; j++) {
                if (j % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            
            }
            System.out.println();
        }
    }
}
