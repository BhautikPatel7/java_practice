package FunctionandMethod;

public class sumofdigit {
    public static void main(String[] args) {
        int n = 121;
        sumofdigit(n);
    }

    private static void sumofdigit(int n ) {
        int lastdigit = 0;
        int sum = 0;
        while ( n != 0) {
            lastdigit = n % 10;
            sum = sum + lastdigit;
            n = n/10;
           
            
        }
         System.out.print(sum);
    }
    
}
