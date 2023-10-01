public class inversioncout {
    public static void main(String[] args) {
        // int arr[] = { 6,5,4,9,2,3,7,0};
        int arr[] = {1,2,3};
        System.out.println("The Inversion Count is " + getinvtcount(arr));
    }

    public static int getinvtcount(int arr[]){
        int n = arr.length;
        int inversioncout = 0;
        
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    inversioncout++;
                }
            }
        }
        return inversioncout;
    }
}
