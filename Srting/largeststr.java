package Srting;

public class largeststr {
    public static void main(String[] args) {

        String fruit[] = {"Apple" ,"apple", "Banana", " Mango"};
        String largeststr = fruit[0];
//System.out.println(largeststr);
        for (int i = 1; i < fruit.length; i++) {
            if (largeststr.compareToIgnoreCase(fruit[i] ) < 0) {
                largeststr = fruit[i];
                System.out.println(largeststr);
            }
        }
    }

    public static void lexographical(){
       
     
        }
    
}
