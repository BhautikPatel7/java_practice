

public class Practcemergrsort {
    public static void main(String[] args) {
        int arr[] = {5,6,8,9,4,5,2};

        mergrsort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

       public static void mergrsort(int arr[], int si, int ei){
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) /2;
        mergrsort(arr, si, mid);
        mergrsort(arr, mid+1, ei);
        performmerge(arr,si,mid,ei);
       }

       public static void performmerge(int arr[],int si, int mid, int ei){

        int temp[] = new int[ei - si  + 1];
        int i = si;
        int  j = mid+1;
        int k = 0;

        while (i<=mid && j<= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                k++;i++;
            }

            else{
                temp[k] = arr[j];
                k++;j++;
            }

        }

        while (i<=mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (k = 0,i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
       }
    
}