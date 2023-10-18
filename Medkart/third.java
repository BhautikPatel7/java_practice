package Medkart;

public class third {
    public static void main(String[] args) {
        String str = "parasetamoel";
        char repet = 'e';
        // char[] ch = str.toCharArray();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }
        System.out.println(count);
    }
}
