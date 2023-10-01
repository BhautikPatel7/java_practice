public class searchinrotetedarray {

    public static void main(String[] args) {
        int arr[] = { 7,6,2,8,4,0,3,9};
        int target = 3;
        int tgidx = search(arr, target, 0, arr.length-1);
        System.out.println(tgidx );
        
    }

    public static int search(int arr[],int target, int si, int ei ){
        if (si>ei) {
            return -1;
        }

        //kam
        int mid = si + (ei - si)/2;
        //case 1
        if (arr[mid] == target) {
            return mid;
        }
        // Mid On Line 1
        if (arr[si]<=arr[mid]) {
            //case a : Left
            if (arr[si] <= target && target <=arr[mid]) {
               return search(arr, target, si, mid-1);
            }
            //case b
            else{
              return  search(arr, target, mid+1, ei);
            }
        }
        //Mid On Line 2
        else{

            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr, target, mid+1, ei);
            }
            else{
                return search(arr, target, si, mid-1);
            }
        }


    }
}