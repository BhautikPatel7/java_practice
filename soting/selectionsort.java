package soting;
// Time complexity O(n^2) for selection and insertion
public class selectionsort {
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        insertionsort(arr);
        printarr(arr);
    }
    public static void insertionsort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int current =arr[i]  ;

            int previous = i - 1;
           while (previous >= 0 && arr[previous] > current ) {
            arr[previous + 1] = arr[previous];
            previous --; 
           } 
           // insert
           arr[previous + 1] = current;
        }
    }

    public static void selection(int a[]){
        for(int i = 0; i < a.length - 1; i++){
            int minpos = i;
            for(int j = i +1; j <=  a.length - 1; j++){
                if (a[minpos]  > a[j]) {
                    minpos = j;
                }
            }
            //swap
            int temp = a[minpos];
            a[minpos] = a[i];
            a[i] = temp;
             
        }
    }
    public static void printarr(int a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        
    }
}
