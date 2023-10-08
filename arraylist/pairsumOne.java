package arraylist;

import java.util.ArrayList;

public class pairsumOne {
    public static void main(String[] args) {
        int target = 5;
        ArrayList<Integer> pair = new ArrayList<>();
        pair.add(1);
        pair.add(2);
        pair.add(3);
        pair.add(4);
        pair.add(5);
        pair.add(6);

        for (int i = 0; i < pair.size(); i++) {
            for (int j = i+1; j < pair.size(); j++) {
                if (pair.get(i) + pair.get(j) == target) {
                    System.out.println("True");
                }
            }
        }
        System.out.println("false ");
        


    }
}
