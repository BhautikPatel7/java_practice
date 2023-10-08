public class Trappingrainwater {
    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(Tappedrainwater(height));
    }

    public static int Tappedrainwater(int height[]) {
        int n = height.length;
        // calculate Left Max Boundry
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }
        // callulat erighr Max Boundry
        int rightmax[] = new int[n];
        rightmax[height.length - 1] = height[height.length - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }
        // loop
        int traped = 0;
        for (int i = 0; i < n; i++) {
            // Waterleval = min(leftmax boundr, rightmost Boundry)
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            // traped water = waterlevel-height[i]
            traped += waterlevel - height[i];
        }
        return traped;
    }
}
