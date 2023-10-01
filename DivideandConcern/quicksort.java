package DivideandConcern;

public class quicksort {
    public static void main(String[] args) {
        // Avrage case TcxO(nlogn)
        //wrost case O(n2)
        // space O(1)
        // Wrost Case Time Complexity Is Sorted

        int arr[] = {6,5,8,2,4};
        quicksort(arr, 0, arr.length -1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }

    public static void quicksort(int arr[],int si, int ei){
        if (si>=ei) {
            return;
        }
        
    int pidx  = particion(arr,si,ei);
    quicksort(arr, si, pidx-1);
    quicksort(arr, pidx+1, ei);

    }

    public static int particion(int arr[], int si, int ei){

        int pivot = arr[ei];
        int i = si - 1;//jagah banana 
        for (int j = si; j < ei; j++) {
            if (arr[j] < pivot) {
                i++;
                //Swap
                int temp =arr[j];
                arr[j] =arr[i];
                arr[i] = temp;
            }
        }

        i++;
                //Swap
                int temp =pivot;
               arr[ei] =arr[i];
                arr[i] = temp;
                return i;

    }
}
