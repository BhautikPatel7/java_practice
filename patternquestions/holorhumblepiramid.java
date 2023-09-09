package patternquestions;

public class holorhumblepiramid {
    public static void main(String[] args) {
        holorohumbus(25);
    }
    private static void holorohumbus(int n) {
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j < n-i +1; j++) {
                System.out.print(" ");
                
            }
            for (int j = 0; j < n; j++) {
                if (i == 1 || j == 0 || i == n || j == n-1) {
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
