package arraylist;

import java.util.ArrayList;

public class optimizedpairsum {
    public static void main(String[] args) {
        int target = 5;
        ArrayList<Integer> pair = new ArrayList<>();
        pair.add(1);
        pair.add(2);
        pair.add(3);
        pair.add(4);
        pair.add(5);
        pair.add(6);
      System.out.println( pairsum(pair, target));
        
    }

    public static boolean pairsum (ArrayList<Integer> list, int target){
        int lp = 0;
         int rp = list.size()- 1;
         while (lp != rp) {
            if (list.get(lp)+list.get(rp) == target) {
                return true;
            }
            else if (list.get(lp)+list.get(rp) < target) {
                lp++;
            }
            else if (list.get(lp)+list.get(rp) > target) {
                rp--;
            }
                
          
         }
          return false;

    }
}
