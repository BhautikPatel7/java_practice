package arraylist;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class first {
    public static void main(String[] args) {
        //first obj = new first();
        // Java Collection Framework
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String>  list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();


        list2.add("hello");
        list.add(1);
        list.add(2);
        list.add(15);
        list.add(4);
        list.add(9);

        System.out.println(list);
        System.out.println(list.get(2)); 
        list.remove(3);
        System.out.println(list);

        list.set(2, 4);
        System.out.println(list);
        System.out.println(list.contains(1));
        System.out.println(list.contains(60));

         list.add(1, 9);//O(n)
         System.out.println(list);

         int x = list.size();
         System.out.println(x);

         for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
         }
         System.out.println();

         for (int i = list.size()-1; i >= 0; i--) {
            System.out.print(list.get(i));
         }
         int max = Integer.MIN_VALUE;
         for (int i = 0; i < list.size(); i++) {
           
           if (list.get(i) >= max) {
            max = list.get(i);
           }
        
         }
            System.out.println(max);
        //////////////////////////////Swap Technics////////////////////////////////
        // x = x + y
        // y = x - y
        // x = x - y
        ///////////////////////// using Bitwise Opertpr/////////////////////////
        // i = i ^ k;
        // k = i ^ k;
        // i = i ^ k;

        System.out.println(list.get(1));
        System.out.println(list.get(2));
        int temp = list.get(1);
        list.set(1,15);
        list.set(2, temp);
         System.out.println(list.get(1));
        System.out.println(list.get(2));

        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);



        
        
        
    }
}
