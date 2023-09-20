package Srting;

public class stringcompare {
    public static void main(String[] args) {
        String s1 = "Toggy";
        String s2 = "Toggy";
        String s3 = new String("Toggy");
        if (s1 == s2 ) {
            System.out.println("Strings are Equals");
        }
        else{
            System.out.println("String Are Not Equals");
        }
          if (s2 == s3 ) {
            System.out.println("Strings are Equals");
        }
        else{
            System.out.println("Strings Are Not Eqals");
        }
        if (s1.equals(s3)) {
            System.out.println("its equals");
        }
    }
}
