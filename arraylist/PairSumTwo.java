package arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PairSumTwo {

    // This is For Sorted And roteted
    //O(n)
    public static void main(String[] args) {
         int target = 16;
        ArrayList<Integer> pair = new ArrayList<>();
        pair.add(11);
        pair.add(15);
        pair.add(6);
        pair.add(8);
        pair.add(9);
        pair.add(10);

       // ThiS Will Sort The ArrayList And After We Can Use Normal Method Collections.sort(pair);
        // We Can Find Brut force And Find The Sum for every I anD J We Callulate Sum Is Eqals Target Then Return iTS

        System.out.println(Sumtwopair(pair, target));
      
        
    }

    public static boolean Sumtwopair(ArrayList<Integer> list, int target){
        //Two Pointer Approch
        int bp = -1;
         for (int i = 0; i < list.size(); i++) {
           if (list.get(i) > list.get(i+1)) {
            bp = i;
            break;
           } 
         }
         int lp = bp+1;
         int rp = bp;
         while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return  true; 
            }
            else if (list.get(lp) + list.get(rp) < target) {
                lp = (lp+1)%list.size();
            }
            else{
                rp =  (list.size() + rp -1) % list.size();
            }
         }

         return false;


    }
}
