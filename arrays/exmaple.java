package arrays;
import java.util.*;

public class exmaple {
    public static void main(String[] args) {
        int n;//how many element you want to store
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many elemt you want to enter");
        n = sc.nextInt();
        int num[] = new int[n];
        //for taking input from user
        System.out.println("Enter The element ");
        for(int i = 0; i< num.length; i++){
            num[i] = sc.nextInt();
        }
        //printing this element 
        System.out.println("Element of Array");
        for(int i = 0; i< num.length; i++){
            System.out.println(num[i]);
        }  
            // revrseing the array
            int b[] = new int[num.length];
            int d = num.length;
            int j = d;
            //accesing evry elemrnt 
            for(int i = 0; i < n; i++){
                b[j - 1] = num[i];
                j = j -1;
            }     
            //printing revrse array 
            System.out.println("revrse The array");
            for (int k = 0; k < b.length; k++) {
                System.out.println(b[k]);
                
            }
            System.out.println(b[3]);

            
    }

  
}
