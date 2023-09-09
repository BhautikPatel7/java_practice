package patternquestions;

public class diomondpt {
    public static void main(String[] args) {
        dimondpt(25);
    }

    private static void dimondpt(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2*i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2*i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        }
    }
    
    
    

