package patternquestions;

public class rotedhalfppyramid {
    public static void main(String[] args) {
        pattrernp(3, 4);
        
    }
    public static void pattrernp(int space,int star){
        for(int i = 0; i < star; i++){
            for (int j = 0; j < star-i; j++) {
                System.out.print(" ");
                
            }
            for (int j  = 0; j <= i; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }
            
        }
    }

