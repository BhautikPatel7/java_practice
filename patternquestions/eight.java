package patternquestions;

public class eight {
    public static void main(String[] args) {
        pattern(4);
    }

    private static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("#");
            }
            for (int j = 1; j <= 2*i - 1; j++) {
                System.out.print(j);
            }
            for (int j = 9 - 3*i + 3; j>=1; j-- ) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
    
}
