package FunctionandMethod;

import java.util.Scanner;

public class bionominalcofficent {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number Here");
        int a = sc.nextInt();
        int b = sc.nextInt();
        bionomialcofficent(a, b);
        findfactorial(a);
    }

    public static int findfactorial(int a){
        int f;
        if(a == 0){
            System.out.println(1);
        }else if(a==1){
            System.out.println(1);

        }
        else{
            for( f = 2; f <= a; f++){
                f = a*(a-1);
                
            }
        }
        return a;
    }

     public static int bionomialcofficent(int d, int r) {
        int bnf;
        int g = findfactorial(d);
        int  h = findfactorial(r);
        int j  = findfactorial(d-r);
        bnf = g / (h)*(j);
        System.out.println(bnf);
        return bnf;
        
    }
    
}
