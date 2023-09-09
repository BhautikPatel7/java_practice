public class prefixsum {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6,7};
        subarray(num);
    }

    private static void subarray(int[] num) {
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefixsum[] = new int[num.length];
        prefixsum[0] = num[0];
        for (int i = 1; i < prefixsum.length; i++) {
            prefixsum[i] = prefixsum[i-1] + num[i]; 
        }
        for (int i = 0; i < num.length; i++) {
        int start = num[i];
            for (int j = i; j < num.length; j++) {
                int end = num[j];
               currentsum = start == 0?prefixsum[end]: prefixsum[end] - prefixsum[start - 1];
                if (maxsum < currentsum) {
                    maxsum = currentsum;
                    
                }
               
            }
           
        }
    System.out.println("max sum is " + maxsum);
    
    }
}
