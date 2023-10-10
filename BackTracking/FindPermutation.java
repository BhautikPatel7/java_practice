package BackTracking;

public class FindPermutation {
    public static void main(String[] args) {
        String str = "ABC";
        FindPermutation(str, " ");

    }
    //Time Com-plexity = o(n)
    public static void FindPermutation(String str, String ans) {
        // bASE cASE
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // recursion
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
             String Newstr = str.substring(0, i) + str.substring(i + 1);
            FindPermutation(Newstr, ans + current);

        }
    }
}
