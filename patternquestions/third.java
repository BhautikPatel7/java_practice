package patternquestions;

public class third {
    public static void main(String[] args) {
        pattern(5);
    }

    private static void pattern(int n) {
        int flag = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 2; j <= i ; j++) {
                if (i == 3 && j == 2 ) {
                    System.out.print("");
                }else{
                System.out.print("*");
                }
                
            }
                 
            for (int j = i; j <= n; j++) {
           
                if (i==3 && j >= 2 && j<5 && flag == 0 ) {
                    System.out.print("A");
                    flag = 1;
                    continue;
                }
                else if( i == 3 && j == 4) {
                System.out.print("");
                }
                else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
    
}
