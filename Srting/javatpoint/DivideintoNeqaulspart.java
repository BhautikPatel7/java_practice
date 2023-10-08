package Srting.javatpoint;

public class DivideintoNeqaulspart {
    public static void main(String[] args) {
        int n = 3;
        String str = "aaaabbbbcccc";
        int temp = str.length() % n;
        int ss = str.length()/n;
        String[] ewString = new String[n];
        if (temp != 0) {
            System.out.println("its Not Divisable");
            
        }
        else{

            for (int i = 0; i < str.length(); i= i + ss) {
                String part = str.substring(i, i+ss);
                ewString[temp] = part;
                temp++;
            }
            for (int i = 0; i < ewString.length; i++) {
                System.out.println(ewString[i]);
            }

        }
    }
}
