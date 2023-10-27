package Stack;
import java.util.*;
//Revrese A String Using Stack

import Srting.revrse;


public class RevrseAString {
    public static void main(String[] args) {
            String str = "abc";
            System.out.println(revrsestring(str));
            
           
    }   

    public static String revrsestring(String str){
        Stack<Character> s = new Stack<>();
        int index = 0;
        while (index < str.length()) {
            s.push(str.charAt(index));
            index++;
        }

        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char cur = s.pop();
            result.append(cur);

        }
      return  result.toString();
    }
}
