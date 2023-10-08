package arraylist;

import java.util.ArrayList;

public class containerwithmostliter {
    public static void main(String[] args) {
       ArrayList<Integer> height = new ArrayList<>();
       height.add(1);
       height.add(8);
       height.add(6);
       height.add(2);
       height.add(5);
       height.add(4);
       height.add(8);
       height.add(3);
       height.add(7);
    // System.out.println(storewater(height)); 
     System.out.println(storewateroptimise(height)); 
      

    }

    public static int storewater(ArrayList<Integer> height){
        // Time Complexity O(n^2)
        int maxwater = 0;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i+1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j-i;
                int currentwater = ht*width;
                maxwater = Math.max(maxwater, currentwater);
            }
        }
        return maxwater;

    }

     public static int storewateroptimise(ArrayList<Integer> height){

        int max = 0;
        int left=0;
        int right = height.size() - 1;
        while (left < right) {
            int ht = Math.min(height.get(left), height.get(right));
            int wt = right - left;
            int currentwater = ht * wt;
            max = Math.max(max, currentwater);

            // Update The Pointers
            if (height.get(left) < height.get(right)) {
                left++;
            }
            else{
                right--;
            }

            
            
        }
        return max;
     }
}
