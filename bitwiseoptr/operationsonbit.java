package bitwiseoptr;

import java.util.Scanner;

public class operationsonbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a Bit Index Where Do You Wanna Chek");
        // int i = sc.nextInt();
        // Its Get Ith Bit
        // int x = 5 & (1<<i);
        // System.out.println(x);
        // setnthbit(10, 2);
        // System.out.println(clear(10, 4));
        // System.out.println(updateith(10, 2, 1));
        // System.out.println(clearIthbit(14, 3));
        // System.out.println(clearrang(10, 2, 4 ));
        //System.out.println(twopowerchek(8));
        //chekonescounts(15);
        System.out.println(fastexploentioal(5, 3));

    }

    public static int setnthbit(int n, int i) {
        int x = n | (1 << i);
        System.out.println(x);
        return x;
    }

    public static int clear(int n, int i) {
        int x = n & (~(1 << i));
        return x;
    }

    public static int updateith(int n, int i, int newbit) {
        // if (newbit == 0) {
        // return clear(n, i);
        // }
        // else{
        // return setnthbit(n, i);
        // }

        n = clear(n, i);
        int bitmask = newbit << i;
        return n | bitmask;

    }

    public static int clearIthbit(int n, int i) {
        int bitmask = (~0) << i;
        return n & bitmask;
    }

    public static int clearrang(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitmask = a | b;
        return n & bitmask;
    }

    public static boolean twopowerchek(int n) {
        return (n & (n - 1)) == 0;
    }
    public static int chekonescounts(int n){
        // Time Complexity Becomes o(logn)
        // for representing Bits IN Binary us log(base 2) n + 1
        int count = 0;
        while (n>0) {
            if ((n & 1) != 0) {
                count++;
            }
           n = n>>1;

        }
        System.out.println(count);
        return count;

    }

    public static int fastexploentioal(int a, int n){
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
            }
             ans =ans *a;
             a = a *a;
             n = n>>1;
        }
        return ans;
    }

}
