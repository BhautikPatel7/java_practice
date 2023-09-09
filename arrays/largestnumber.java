import java.util.*;
public class largestnumber {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,};
        //System.out.println("The largest value is " + getlargest(num));
       
    }

    public static int getlargest( int num[]){
    int lar = Integer.MIN_VALUE; // -infinity
    for (int i = 0; i < num.length; i++) {
        if(num[i] > lar){
            lar =  num[i];
        }        
    }
    return lar;

    }

    public static int binarysearch(int num[], int key){
        
    }

}
