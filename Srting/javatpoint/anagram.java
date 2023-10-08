package Srting.javatpoint;

import java.lang.reflect.Array;
import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String str = "hello";
        String str2 = "lloeh";
        str =str.toLowerCase();
        str2 =str2.toLowerCase();
        if (str.length() != str2.length()) {
            System.out.println(" An Anagram");
        }
else{
      char ch1[] = str.toCharArray();
      char ch2[] = str2.toCharArray();
      Arrays.sort(ch1);
      Arrays.sort(ch2);
      if (Arrays.equals(ch1, ch2)) {
        System.out.println("Its Anagram");
      }
      else{
        System.out.println("NOt An Anagram");
      }
      } 
    }
}
