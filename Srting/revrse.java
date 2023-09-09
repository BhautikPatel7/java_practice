package Srting;
import java.util.*;

public class revrse {
    
    public static void main(String[] args) {
        String str = "Hello";
        StringBuilder builder = new StringBuilder(str);
       System.out.println(str.toString());

        StringBuilder rstr = builder.reverse();
       System.out.println(rstr);
        
    }
}
