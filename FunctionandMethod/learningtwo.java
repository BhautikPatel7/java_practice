package FunctionandMethod;

public class learningtwo {
    public static void main(String[] args) {
        
        isEven(5);
        
    }
    
    public static boolean isEven(int n ){
        if (n%2 == 0) {
            System.out.println("True");
            return true;
            
        }
        else{
            System.out.println("false");
        return false;
           }
       }
}
