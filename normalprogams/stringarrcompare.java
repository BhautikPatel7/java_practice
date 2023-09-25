package normalprogams;

public class stringarrcompare {
    public static void main(String[] args) {
        String input1[] = { "david", "rahul" };
        String input2 = "in the era of david hu ram sort rahul than comare david and ram or rahul thats sjow how rahul works on real life project";
        String arr[] = input2.split(" ");

        // for dividing string Into many part by Sapce
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        
        for (int i = 0; i < input1.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (input1[i].equals(arr[j])) {
                    count++;
                }
            }

            // }
            // for (String string : input1) {
            // for (String string2 :arr ) {
            // if (input1.equals(arr)) {
            // count++;
            // }
            // }
            System.out.println(input1[i] + " " + count);
        }

    }
}
