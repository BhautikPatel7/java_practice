package FunctionandMethod;

public class functionoveloadusingdata {
    public static void main(String[] args) {
        sum(10, 20);
        System.out.println(sum(10, 20));
        sum(3.12f, 6.14f);
        System.out.println(sum(3.12f, 6.14f));
        
    }
    public static int sum(int a,int b){
        return a+b;
    }
     public static float sum(float a,float b){     
        return a+b;
    }
    
}
