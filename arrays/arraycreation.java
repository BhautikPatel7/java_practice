public class arraycreation {
    
    public static void main(String[] args) {
    int numn[] = { 1 ,2,3,4,5,6,7};
    update(numn);
        
    }
    public static void update(int numn[]){
        for (int i = 0; i < numn.length; i++) {
            numn[i] = numn[i] + 1;
            System.out.println(numn[i]);
            
        }
    }
    
}
