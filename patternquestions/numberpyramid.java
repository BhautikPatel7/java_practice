package patternquestions;

public class numberpyramid {
    public static void main(String[] args) {
        numpira(25);
    }

    private static void numpira(int n) {
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i ; j++) {
                System.out.print(i + " ");
                
            }
            System.out.println();
        }
    }
    
}
