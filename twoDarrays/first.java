package twoDarrays;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        
        int arr[][] = new int[3][3];
        int n = arr.length;
        int m = arr[0].length;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
               
            }
          
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

           serach(arr, 9);
    }

    public static boolean serach(int arr[][], int key){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    System.out.println("The Element Of index i and j is " + i + "," + j);
                    return true;
                }
                
            }
        }
        System.out.println(" Key Not Found");
        return false;
    }
}
