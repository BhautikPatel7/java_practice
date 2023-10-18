package Medkart;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    // System.out.print(FirstReverse(s.nextLine())); 
    String str = "Hello Java";
    // System.out.println(str);
    // // System.out.println(FirstReverse(str));
    // System.out.println(revrsearray(str));
    // char[] charArray = {'H', 'e', 'l', 'l', 'o'};
    // String str1 = new String(charArray);
    //     str = charArray.toString();
    //    String str2 = new String(charArray);
    // System.out.println("String from character array: " + str1);
    // System.out.println("String from character array: " + str2);
    System.out.println(revrserecorsion(str));


    }

    public static String FirstReverse(String str) {
       
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        return sb.toString();
        
      }

      public static String revrsearray(String str){
        char[] ch = str.toCharArray();
        for (int i = 0, j = ch.length - 1; i < j; i++,j--) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }
       String revrsed = new String(ch);
       return revrsed;
      }

      public static String revrserecorsion(String str){
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }
        char firstchae = str.charAt(0);
        String reman = str.substring(1);
        String revresedrest = revrserecorsion(reman);
        String revresed = revresedrest + firstchae;
        return revresed;
      }
}
