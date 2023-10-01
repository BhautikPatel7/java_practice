import oops.staticlr;

public class mergesortofstr {
    public static void main(String[] args) {
        String str[] = {"sun","earth","mars","mercury"};
        mergesort(str, 0, str.length-1);
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i] + " ");
        }
    }

    public static String[]  mergesort(String arr[],int lo, int ho){
        if (lo == ho) {
            String[] a = {arr[lo]};
            return a;
        }
            int mid =  lo + (ho - lo)/2;//(lo+ho)/2;
            String arr1[] = mergesort(arr, lo, mid);
            String arr2[] = mergesort(arr, mid+1, ho);
            
            
            String arr3[] = merge(arr1,arr2);
            return arr3;
    }

    public static String[] merge(String[] arr1, String[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        String[] arr3 = new String[m+n];

        int idx=0, i=0,j=0;

        while (i<m && j<n) {
            if (isAlphabeticalsmaller(arr1[i], arr2[j])) {
                arr3[idx] = arr1[i];
                i++;
                idx++;
            }
            else{
                arr3[idx] = arr2[j];
                j++;
                idx++;
            }
        }
        while (i<m) {
            arr3[idx] = arr1[i];
                i++;
                idx++;
        }
        while (j<n) {
            arr3[idx] = arr2[j];
                j++;
                idx++;
        }
        return arr3;
    }

    public static boolean isAlphabeticalsmaller(String str1, String arr2){
        if (str1.compareTo(arr2) < 0) {
            return true;
        }

        else{
            return false;
        }
    }
}
