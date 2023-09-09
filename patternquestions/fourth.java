package patternquestions;

public class fourth {
    public static void main(String[] args) {
        pattern(6);
    }

    private static void pattern(int n) {
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j < n - i ; j++) {
                System.out.print("*");   
            }
            for (int j = 1; j <= 2*i - 1; j++) {
                if (j == 1 || j == 2*i -1) {
                    System.out.print(j);
                    
                } else {
                    System.out.print("*");
                    
                }
                
            }
            System.out.println();     
        }
    }
    
}
