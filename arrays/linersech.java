import java.util.Scanner;

public class linersech {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A five Number here");
        int num[] = new int[5];
        for (int i = 0; i < num.length; i++) {
             num[i] = sc.nextInt();

        }
        
        lr(num);
    }
    
    public static void lr(int num[]){
        Scanner sc = new Scanner(System.in);
        int el = sc. nextInt();
        for (int i = 0; i < num.length; i++) {
            if (num[i] == el) {
                System.out.println("The Element is On \n" + i+num[i] );   
            }
        }

        
    }
}
