public class revrsearray {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6,7,8,9};
        revrse(num);
    }
    public  static void revrse(int num[]){
        
        for (int i = 0; i < num.length; i++) {
           int first = 0;
           int last = num.length - 1; 
           int temp = 0;
           temp= num[first];
          num[first]=num[last];
           num[last] = temp;
           first++;
           last--;
            System.out.println(num[i]);
        }

    }
}
