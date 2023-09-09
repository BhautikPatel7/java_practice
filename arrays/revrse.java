public class revrse {
    public static void main(String[] args) {
        int arr[] = { 1,2,3,6,7,8};
        int ind = 3;
        int val = 13;
        int arr2[] =new int[arr.length + 1];
        for (int i = 0; i < arr2.length; i++) {
            if(i == ind){
                arr2[ind] = val;
            }
            else if(i < ind){
                arr2[i] = arr[i];
            }
            else{
                arr2[i] = arr[i - 1];
            }  
        }
        printarr(arr2);


        // for (int i = 3; i <= arr.length; i++) {
        //     arr[i]++;

        // }
        // System.out.println();
        // for (int i = arr.length - 1; i >= 0; i--) {
        //     //System.out.println(arr[i]);
        //     int rev[] = new int[6];
        //     rev[i] = rev[i] + arr[i];
        //     System.out.print(rev[i]);  
        // }
        }
        public static void printarr(int arr[]){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+ " ");
            }
        }
}
