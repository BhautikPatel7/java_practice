 package BackTracking;

class FindSubset {


    // Subset Of N letnh Array or String Is 2^n

    public static void main(String[] args) {
        String str = "ABC";
        findsubset(str, "", 0);

    }
    public static void findsubset(String str,String ans, int i){
        //base case
        //O(n*2^n)
        if(i == str.length()){
            // if (ans.length() == 0) {
            //     System.out.println("Null");
            // }else{
                 System.out.println(ans);
                return;
            // }
        }
        // Recursion
        //Yes Choise
        findsubset(str, ans+str.charAt(i), i+1);
        //No Choise
        findsubset(str, ans, i+1);

    }


}