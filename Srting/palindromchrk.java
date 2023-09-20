package Srting;

public class palindromchrk {
    public static void main(String[] args) {
        String str = "raceca";
        chek(str);
    }

    public static boolean chek(String str ){
        int n = str.length();
        for (int i = 0; i <str.length(); i++,n--) {
            
            if (str.charAt(i) == str.charAt(n-1)) {
                System.out.println("Yes Its Palindrom");
                return true;
            }
            else{
                System.out.println("NO Its not Palindrom");
                return false;
            }
        }
        return false;
    }
}
