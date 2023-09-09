import java.util.Scanner;


public class JavaBasic{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Plese Enter The number here");
        int num = sc.nextInt();
       
if(num == 2){
    System.out.println("this is prime");
}else{


        for(int n = 2; n <= Math.sqrt(num) ;n++){
            if(num % n == 0){
                System.out.println("This is Not A Prime Number");
                break;
            }
            else{
                System.out.println("This is a prime number");
                break;
            }             

        }
        }

    }
 }   
