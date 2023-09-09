package patternquestions;

public class halfpiramidtir {
    public static void main(String[] args) {
        solidrohumbus(5);
    }

    private static void solidrohumbus(int n) {
        for (int i = 1; i <= n ; i++) {
            for (int j = 0; j < n-i +1; j++) {
                System.out.print(" ");
                
            }
            for (int j = 0; j < n; j++) {
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
}
