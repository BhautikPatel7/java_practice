package Srting;

public class anothermethod {
    public static void main(String[] args) {
        String str = "Hello";
        char ch[] = str.toCharArray();
            for (int j = 0; j < ch.length; j++) {
                System.out.print(ch[j]);
                
            }
            System.out.println();
        for (int i = str.length() - 1; i >=0; i--) {
            // System.out.print(str.charAt(i));

            String rev = "";
            rev = rev + str.charAt(i);
            System.out.print(rev);
            
        }
    }
}
