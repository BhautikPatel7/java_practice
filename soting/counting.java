package soting;

public class counting {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 4, 5, 4, 6, 8, 8, 5, 5, 5, 4, 1, 5, 6, 4, 2, 3, 4 };
        countingsort(arr);
        printarr(arr);
        

    }
    public static void printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void countingsort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Sorting Step
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                count[i]--;

            }

        }

    }
}
