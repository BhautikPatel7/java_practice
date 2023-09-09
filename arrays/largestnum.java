package arrays;

public class largestnum {
    public static void main(String[] args) {
        int marks[] = {1,5,4,9,7,5};
        System.out.println(gretest(marks));

    }
    
    public static int gretest(int marks[]){
        int larget = Integer.MIN_VALUE;//infinity
        for(int i = 0; i < marks.length;i++){
            if(larget < marks[i]){
                larget = marks[i];
            }

        }
            return larget;
    }
    
}
