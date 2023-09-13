package recursion;

public class first {
    public static void main(String[] args) {
        int n = 20;
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 5, 9 };
        // printdecresing(n);
        // printincresing(n);
        // System.out.println(printfact(5));
        // System.out.println(sumofnum(5));
        // System.out.println(fibonaci(5));
        // fibonaci(5);
        // System.out.println(arraysortornot(arr, 0)); ;
        // System.out.println(firstoccurenceofele(arr, 5,0));
       // System.out.println(lastoccure(arr, 5, 0));
    }

    public static void printdecresing(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n + " ");
        printdecresing(n - 1);

    }

    public static void printincresing(int n) {
        if (n == 0) {
            // System.out.println(n);
            return;
        }
        printincresing(n - 1);
        System.out.println(n + " ");

    }

    public static int printfact(int x) {
        if (x == 0) {
            return 1;
        }
        // int fnm1 = printfact(x-1);

        // time complexity == O(n);
        // space Complexity == O(n);
        int fn = x * printfact(x - 1);
        return fn;

    }

    public static int sumofnum(int n) {
        if (n == 0) {
            return 0;
        }
        int sum = n + sumofnum(n - 1);
        return sum;
    }

    public static int fibonaci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        // Finding Nth term of fibonaci series
        // Time omplexity of This is O(2^n)
        // Spcace Complexity is O(n)
        int fbnm1 = fibonaci(n - 1);
        int fbnm2 = fibonaci(n - 2);
        int fbn = fbnm1 + fbnm2;

        return fbn;
    }

    public static boolean arraysortornot(int a[], int i) {
        // Time and Space Complexity Is O(n)

        if (i == a.length - 1) {
            return true;
        }
        if (a[i] > a[i + 1]) {
            System.out.println("Array Is not Sorted");
            return false;
        }
        return arraysortornot(a, i + 1);

    }

    public static int firstoccurenceofele(int a[], int key, int i) {
        // Time and Space Complexity IS O(n);

        if (i == a.length) {
            return -1;
        }

        if (a[i] == key) {
            return i;
        }
        // occurenceofele(a, key, i+1);
        return firstoccurenceofele(a, key, i + 1);
    }

    public static int lastoccure(int arr[],int key,int i){
        if (i == arr.length ) {
            return -1;
        }
        int isfound = lastoccure(arr, key, i+1);
            if (isfound != -1) {
                return isfound;
            }
            if (arr[i] == key) {
                return i;
            }

            return isfound;
    }
}
