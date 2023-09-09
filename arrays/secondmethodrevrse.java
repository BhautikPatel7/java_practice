package arrays;
import java.util.*;

public class secondmethodrevrse {
    public static void main(String[] args){
        System.out.println("enter The Number That you Want to store");
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        System.out.println("Enter the second Element");
        int m = sc.nextInt();
        System.out.println("Enter The elemet ");
        // int num[] = new int[n];

        // for (int i = 0; i < num.length; i++) {
        //     num[i] = sc.nextInt();
            
        // }

        int num [][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++){
                num[i][j] = sc.nextInt();
                System.out.println(num[i][j]);
            }
             
        }
         
       


        

    }
    
}
