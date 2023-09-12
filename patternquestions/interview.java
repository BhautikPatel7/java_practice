package patternquestions;

public class interview {
    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 7; k++) {
                    if (i % 2 == 0 || j % 2 == 0 || k % 2 == 0) {
                        System.out.print("*");
                       
                    }
                }
            }

        }
        
    }
}
