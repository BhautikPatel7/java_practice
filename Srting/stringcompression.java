package Srting;

public class stringcompression {
    public static void main(String[] args) {
      Integer count = 0;
        String Str2 = "";
         String str =  "aaaabbcccdd";
         for (int i = 0; i < str.length(); i++) {
           count = 1;
           while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
            count ++;
            i++;
           }
           Str2 +=  str.charAt(i);
           if (count > 1) {
            Str2 += count.toString();
           }
       }
       for (int i = 0; i < Str2.length(); i++) {
        System.out.print(Str2.charAt(i) + " ");
       }
    }
}
