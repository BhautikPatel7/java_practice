package Srting.campusmonk;

public class lowerandupper {
    public static void main(String[] args) {
        String str = "Campusmonk";
       
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 != 0) {
                System.out.print(Character.toUpperCase(str.charAt(i)));
            } else {
                System.out.print(Character.toLowerCase(str.charAt(i)));
                // System.out.println(str.charAt(i));

            }

        }

    }
}
