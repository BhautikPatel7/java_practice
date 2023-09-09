package FunctionandMethod;

public class convertbinarytodecimal {
    public static void main(String[] args) {
        bintodec(101);
        
    }
    public static void bintodec(int binnum ){
        int mynum = binnum;
        int pow = 0;
        int dec = 0;
        while (binnum > 0) {
        int lastdigit = binnum % 10;
        dec = dec + (lastdigit * (int )Math.pow(2, pow));
        pow ++;
        binnum = binnum / 10;

        }
        System.out.println(mynum + " Decimal Is " + dec);


    }
    
}
