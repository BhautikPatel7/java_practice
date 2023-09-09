public class printofsubarray {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6,7};
        subarray(num);
    }
    public static void subarray(int num[]){
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
        int start = num[i];
            for (int j = i; j < num.length; j++) {
                int end = num[j];
                for (int k = start; k < end; k++) {
                    //System.out.print(num[k] + " ");
                    currentsum = currentsum + num[k];
                    
                }
                System.out.println(currentsum);
                if (maxsum < currentsum) {
                    maxsum = currentsum;
                    
                }
                System.out.println();
            }
            System.out.println();
        }
    System.out.println("max sum is " + maxsum);
    }
    
}
