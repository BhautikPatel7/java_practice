package Medkart;

import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        int n = 15;
        int count = 0;
        int num = 2;

        while (count < n) {
            if (isprime(num)) {
                 count++;
                if (count == n) {
                    System.out.println("The 15 Prime Num is " + num);
                }
               
            }
            num++;
        }
    }
    public static Boolean isprime(int num){
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
