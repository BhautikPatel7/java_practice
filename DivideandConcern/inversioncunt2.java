public class inversioncunt2 {
    public static void main(String[] args) {
        int arr[] = {7,5,2,6,4};
        System.out.println(getiversion(arr));
    }

    public static int  mergrsort(int arr[] , int left, int right){
        int invcleft = 0;
       if (right>left) {
        int mid = (right + left) / 2;
       }
        int mid = left + right / 2; // (si + ei)/2
        invcleft = mergrsort(arr, left, mid);//right
        invcleft += mergrsort(arr, mid+1, right);//left
         invcleft += mergearr(arr, left, mid+1, right);
         return invcleft;

    }

    public static int mergearr(int arr[],int left, int mid, int right){
        //left(0,3) = 4
        //right(4,6) = 3
        // temp     array lenth = 6 - 0 + 1;
        int temp[] = new int[right-left +1];

        int i = left;
        int j = mid ;
        int invct = 0;
        int k = 0;

        while (i< mid && j<= right) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                //k++;
                
            }
            else{
                temp[k] = arr[j];
                invct += (mid - 1);
                j++; //k++;
            }

            k++;
        }
        // If any remaining elemnt in Left Part
        while (i<mid) {
            temp[k++] = arr[i++];
        }
        //For Remaining Part Of Right Part
        while (j<=right) {
            temp[k++] = arr[j++];
        }

        // copy temp to original array
        for ( k = 0,i=left; k < temp.length; k++,i++) {
            arr[i] = temp[k];

        }
        return invct;

    }
    public static int getiversion(int arr[]){
        int n = arr.length;
        return mergrsort(arr, 0, n-1);
    }
}
