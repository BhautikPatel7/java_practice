package Srting.javatpoint;

import multithreading.mainthred;

public class countvolveandcontains {
    public static void main(String[] args) {
        // String str = " hello I am java Learner! Nice to Meet You. Warm Welcome to My Git HUb";
        String str = "This is a really simple sentence";
        int vc =0, cc=0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'u'||str.charAt(i) == 'o'||str.charAt(i) == 'i'||str.charAt(i) == 'e') {
                vc++;

            }
            else if (str.charAt(i) > 'a' && str.charAt(i) <= 'z') {
                cc++;
            }
        }
        System.out.println(vc + " " + cc);
    }
}
