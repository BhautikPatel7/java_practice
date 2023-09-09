package patternquestions;

public class onetwothree {
    public static void main(String[] args) {
        pattern(5);
    }

    private static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2*i -1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
    
}
