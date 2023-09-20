package Srting;

import recursion.first;

public class sortespath  {
    public static void main(String[] args) {
        String path = "WNEENESENNN";
       System.out.println(shortestpath(path) ); 
        
    }

    public static float shortestpath(String str){

        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
             char dir = str.charAt(i);
             if (dir == 'S') {
                y --;
             }
              if (dir == 'N') {
                y ++;
             }
              if (dir == 'E') {
                x++;
             }
              if (dir == 'W') {
                x --;
             }

          
                          
            
            
        }
           float x2 = x*x;
             float y2 = y*y;
        return (float) Math.sqrt(x2-y2);
        

    }
}
