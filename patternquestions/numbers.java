package patternquestions;

public class numbers {
    public static void main(String[] args) {
        pattern(5);
    }
    
    public static void pattern(int n){
        for (int i = 0; i < n; i++ ) {

            for (int j = 0; j < n - i; j++) {
                System.out.print(j);
                
            }
            System.out.println();
        }
    }
}
