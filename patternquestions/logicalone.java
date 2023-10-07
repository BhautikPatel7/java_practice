package patternquestions;

public class logicalone {
    public static void main(String[] args) {
        //int n = 10;
        int n = 4; // Define the number of rows for the pattern
        int startNum = 10; // Initialize the starting number

        for (int i = 1; i <= n; i++) {
            int num = startNum;
            int step = (i % 2 == 0) ? -1 : 1; // Determine the step direction

            for (int j = 1; j <= i; j++) {
                System.out.print(num + " "); // Print the current number
                num += step; // Update the current number based on the step
            }

            System.out.println(); // Move to the next line for the next row
            startNum -= i; // Update the starting number for the next row
        }

    }
}
