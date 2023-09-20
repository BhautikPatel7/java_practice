 package Srting;

import java.util.Scanner;

public class creatindcharra {
 
    public static void main(String[] args) {
        // char arr[] = {'a','b','c','d'};
        // String str = "abcd";
        // String str2 = new String("xyz");

        // //String Are Immutable

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name.length());

        String Firstname = "My name ";
        String Lastame = "My Sirname ";

        printcharr(Lastame);

        String Fullname = Firstname + Lastame;
        // System.out.println(Fullname);
     //   System.out.println(Lastame.charAt(0));


    }

    public static void printcharr(String Str){
        for (int i = 0; i < Str.length(); i++) {
            System.out.println(Str.charAt(i));
        }
    }
}