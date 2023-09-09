package arrays;

public class arrayrevrse {
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        revrw(num);
        for(int i = 0; i < num.length  ; i++){
        System.out.println("revrese array is"+num[i]);
    }
}
    public static void revrw(int num[]){
        int firt = 0;
        int last = num.length - 1;

        while (firt < last) {
            int temp = num[last];
            num[last] = num[firt];
            num[firt] = num[last];
            firt ++;
            last --;

            
        }
    }
}
