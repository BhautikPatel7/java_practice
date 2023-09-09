package arrays;

public class linearsearch {
    public static void main(String[] args) {
        int marks[]= {2,4,6,8,10,12,14};
        int key = 10;
        int index = linearsr(marks, key);
        if(index == -1){
            System.out.println("THE NUM IS NOT EXIST");
        }
        else{
            System.out.println(marks[index]);
        }

    }
    public static int linearsr(int marks[],int key){
        for(int i = 0; i< marks.length; i++){
            if(marks[i]==key){
                return i;

            }
            
        }
        return -1;
       

    }
    
}
