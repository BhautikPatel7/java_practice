public class majorityelemt {
    public static void main(String[] args) {
        int arr[] = {3,1,3};
        System.out.println(majoritycount(arr));
    }

    public static int majoritycount(int[] nums){
        int majoritycount = nums.length/2;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j]== nums[i]) {
                    count++;
                }
            }

            if (count>majoritycount) {
                return nums[i];
            }
        }
        
            
        


        return -1;

    }
}