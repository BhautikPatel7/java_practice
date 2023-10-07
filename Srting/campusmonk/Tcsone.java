package Srting.campusmonk;

import java.util.Scanner;
import java.util.*;

public class Tcsone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter A String That Includes NUm Charcter And Special Charcters");
        String barcode = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < barcode.length(); i++) {
            int assci = (int) barcode.charAt(i);

            switch (assci) {
                case 48:
                    sum += 0;
                    break;
                case 49:
                    sum += 1;
                    break;
                case 50:
                    sum += 2;
                    break;
                case 51:
                    sum += 3;
                    break;
                case 52:
                    sum += 4;
                    break;
                case 53:
                    sum += 5;
                    break;
                case 54:
                    sum += 6;
                    break;
                case 55:
                    sum += 7;
                    break;
                case 56:
                    sum += 8;
                    break;
                case 57:
                    sum += 9;
                    break;
                default:
                    sum += 0;
                    break;
            }

            if (assci < 48 || assci > 57) {
                int num = assci;
                int count = 0;

                // int arr[] = new int[];
                while (num != 0) {
                    // int reminder = num%10;
                    num /= 10;
                    count++;

                }
                int arr[] = new int[count];
                int num2 = assci;

                for (int j = 0; j < arr.length; j++) {

                    arr[j] = num2 % 10;
                    num2 /= 10;

                }
                int max1 = 0;
                for (int j = 0; j < arr.length; j++) {
                    max1 = Math.max(max1, arr[j]);
                }
                sum += max1;
            }
        }
        System.out.println(sum);

    }
}
