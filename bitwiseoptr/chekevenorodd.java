package bitwiseoptr;
import java.util.*;

public class chekevenorodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();

        int x = n & 1;
        //System.out.println(x);
        if (x==1) {
            System.out.println("Its an Odd Number");
        }else{
            System.out.println("Its an Even Num");
        }
    }
}
