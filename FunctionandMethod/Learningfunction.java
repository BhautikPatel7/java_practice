 package FunctionandMethod;

import java.util.Scanner;

public class Learningfunction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("plese Enter a Number");
     int a = sc.nextInt();
     System.out.println("plese Enter a Number");
      int b = sc.nextInt();
        printsum(a,b);//Function Call
       
    }
    public static int  printsum(int a ,int b ){
    
     
     int sum = a + b;
     System.out.println("The Sum OF Number Is\n" + sum);

    return sum ;
 }

    

    
}