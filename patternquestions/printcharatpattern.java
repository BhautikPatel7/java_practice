package patternquestions;

public class printcharatpattern {
    int n = 4;
    char cb = 'a';
    public static void main(String[] args) {
         int n = 4;
         char cb = 'a';
        for(int line = 1;line <= 4; line++){
            for(int chars = 1; chars <= line; chars++){
                System.out.print(cb);
                cb++;
            }
            System.out.println();
        }
    }
    
}
