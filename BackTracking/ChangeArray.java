package BackTracking;

// Bactring Alwasy Done After Function call
//O(n);

//O(n) Space 

public class ChangeArray {
    public static void main(String[] args) {
        int arr[] =  new int[5];
        changearray(arr, 0, 1);
        printarr(arr);
     }

     public static void changearray(int arr[] , int i, int val){
        //base case
        if (i==arr.length) {
            printarr(arr);
            return;
        }

        //Recurion
        arr[i] = val;
        changearray(arr, i+1, val+1);
        arr[i] = arr[i] - 2;

     }
     public static void printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
     }
}
