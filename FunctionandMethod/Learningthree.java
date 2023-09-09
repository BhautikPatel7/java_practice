package FunctionandMethod;

import java.util.Scanner;

public class Learningthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number ");
        int n = sc.nextInt();
        palidro(n);
        
    }

    private static boolean palidro(int n) {
          int d = 0;
        while (n != 0) {
          int c = n% 10;
          d  = d * 10 + c;
          n = n / 10;

          

        }
        if (n == d) {
            System.out.println("is not palindrom");
            return true;
            

          }
          else{
            System.out.println("Is  Palindrom");
            
          }
        return false;

    }
    
}
