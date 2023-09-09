package FunctionandMethod;

import java.util.Scanner;

public class callby {
    public static void main(String[] args) {
        // int a = 5;
        // int b = 2 ;
        // // swap
        // int temp = a;
        // a= b;
        // b = temp;
        // System.out.println(a);
        // System.out.println(b);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("Enter a number");
        int b = sc.nextInt();
        swap(a, b);
    }
    public static void swap(int a , int b){
        int c = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);
    }
    
}
