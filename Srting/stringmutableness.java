package Srting;

public class stringmutableness {
    //O(26) Time Complexity
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        sb.toString();
        for(char ch = 'a'; ch<='z';ch++ ){
            sb.append(ch);
        }
        // char a = 'a';
                    System.out.println(sb);

        // a.tostring()
        // Not Allowed Because Of Its Not An Object of A Class
    }
}
