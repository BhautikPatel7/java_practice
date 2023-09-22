package Srting;

public class convertotouppercase {
    public static void main(String[] args) {
        String str = " hi my name is bhautik";
        System.out.println(touupercae(str));

        

        // char c = 'a';
        // char b = Character.toUpperCase(c);
        // System.out.println(b);
    }

    public static String touupercae(String str ){

        StringBuilder sb = new StringBuilder(str);
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
                
            }
           else{
            sb.append(str.charAt(i));
           } 
        }
        return sb.toString();
    }
}
 