package DivideandConcern;

public class mergrsort {
    // Time COmplexity O(nlogn) And Space Complexity O(n)
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        mergrsort(arr, 0, arr.length - 1);
        printarr(arr);
    }
    public static void printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        System.out.println();
    }

    public static void mergrsort(int arr[] , int si, int ei){
        if (si>=ei) {
            return;
        }
        int mid = si + (ei - si) / 2; // (si + ei)/2
        mergrsort(arr, si, mid);//right
        mergrsort(arr, mid+1, ei);//left
        mergearr(arr, si, mid, ei);

    }

    public static void mergearr(int arr[],int si, int mid, int ei){
        //left(0,3) = 4
        //right(4,6) = 3
        // temp     array lenth = 6 - 0 + 1;
        int temp[] = new int[ei-si+1];

        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i<= mid && j<= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                //k++;
                
            }
            else{
                temp[k] = arr[j];
                j++; //k++;
            }

            k++;
        }
        // If any remaining elemnt in Left Part
        while (i<=mid) {
            temp[k++] = arr[i++];
        }
        //For Remaining Part Of Right Part
        while (j<=ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original array
        for ( k = 0,i=si; k < temp.length; k++,i++) {
            arr[i] = temp[k];

        }

    }
}
