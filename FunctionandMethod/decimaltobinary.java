package FunctionandMethod;

import java.util.Scanner;

import patternquestions.nine;

public class decimaltobinary {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number to Convert Binary");
        int n = sc.nextInt();
        decitobina(n);

    }
    public static void decitobina(int n){
        
      while (n > 0) {
       int pow = 0;
       int binnum = 0;
       while (n > 0) {
        int remiender = n % 2;
        binnum = binnum + (remiender * (int)Math.pow(10, pow) );  
        pow++;
        n = n/2;
        
       }
       System.out.println("Binary form is " + binnum);
      }

    }
    
}
