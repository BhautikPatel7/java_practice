package patternquestions;

public class fifth {
    public static void main(String[] args) {
        pattern(7);
    }

    private static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n-i  ; j >= 1; j--) {
                System.out.print(j);
                
            }
            for (int j = n-i  ; j >= 1; j--) {
                System.out.print(j);
                
            }
            System.out.println();
        }
    }
    
}
