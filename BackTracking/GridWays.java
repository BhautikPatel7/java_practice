package BackTracking;

public class GridWays {
    //  Time Complexity o(2^n+m);
    public static void main(String[] args) {
        int n=3; int  m= 3;
        System.out.println(Greedways(0,0,n,m));
    }
    public static int Greedways(int i, int j, int n, int m) {
        if (i==n-1 && j == m-1) {
            return 1;
        }
        else if (i==n||j==m) {
            return 0;
        }
        int way1 = Greedways(i+1, j, n, m);
        int way2 = Greedways(i, j+1, n, m);
        return way1+way2;
        
    }
}
