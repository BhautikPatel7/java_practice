package FunctionandMethod;

import java.util.Scanner;

public class optimisedprime {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 2; i <=Math.sqrt(num); i++){
            if(num % i == 0){
                System.out.println("Its not a Prime Number");
                break;
            }
            else{
                System.out.println("Its A prime Number");
                break;
            }
        }
    }
    
}
