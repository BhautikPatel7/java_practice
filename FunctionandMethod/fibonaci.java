package FunctionandMethod;

import java.util.Scanner;

public class fibonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The num here which you want to print serious");
        int n = sc.nextInt();

        fibonaci(n);
    }

    private static void fibonaci(int n) {
        int a = 0;
        int b = 1;
        int sum = 0;
        System.out.print(a + " " + b);
        for (int i = 1; i < n; i++) {
            sum = a+b;
            System.out.print(" " + sum);
            a = b;
            b = sum;


        }
        System.out.println();
        int min = 0;
        for (int i = n  ; i >= 0 ; i--){
            System.out.print(b+" ");
             min = b - a;
            b = a;
            a = min;
        }
     
    }
     
}
