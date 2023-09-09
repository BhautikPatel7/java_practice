package FunctionandMethod;

import java.util.Scanner;

public class findfactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number Here");
        int a = sc.nextInt();
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
                System.out.println(f);
            }
        }
        return a;
    }
    
}
