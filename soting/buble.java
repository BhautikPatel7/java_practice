package soting;

public class buble {
    public static void main(String[] args) {
     int a[] = {1,3,2,4,5};
     bubble(a);
     printarr(a);
    
    }

    public static void bubble(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int swap = 0;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j+1]) {
                    a[j] = a[j] + a[j+1];
                    a[j+1] = a[j] - a[j+1];
                    a[j] = a[j] - a[j+1];
                    swap++;
                }
              if (swap > 4) {
                continue;
              }
              else{
                System.out.println("aRRAY IS already Sorted");
                break;
                
              }
            }
            //System.out.println(swap);
        }
    }
    public static void printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            
        }
    }
    
}
