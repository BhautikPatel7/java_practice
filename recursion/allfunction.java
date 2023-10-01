package recursion;

public class allfunction {
    // For recurion Use 3 Steps 1 = base Conditon , 2 = work , 3 = faith the minimum
    // find it self
    public static void main(String[] args) {
        int n = 20;
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 5, 9 };
        printdecresing(n);
        printincresing(n);
        System.out.println(printfact(5));
        System.out.println(sumofnum(5));
        System.out.println(fibonaci(5));
        fibonaci(5);
        System.out.println(arraysortornot(arr, 0)); ;
        System.out.println(firstoccurenceofele(arr, 5,0));
        System.out.println(lastoccure(arr, 5, 0));
        System.out.println(powcal(10, 2));
        System.out.println(optimisedpowcal(2, 10));
        System.out.println(tilingpb(5));
        String str = "appnanancolllae";
        removedupstr(str, 0, new StringBuilder(""), new boolean[26]);
        System.out.println(friendspairpb(3));
        binarystringpb("", 3, 0);
        //String str = "";
        printstr(str);
        coocurence(arr, 5, 0);
        stringenglish(2019);
        System.out.println(lenthofstr("Hello")); //lenthofstr("Hello");
        //System.out.println(countsubstr("abca", 0, n-1, n));
       towerofhonai(2, "S", "H", "D");

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

    public static int lastoccure(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isfound = lastoccure(arr, key, i + 1);
        if (isfound != -1) {
            return isfound;
        }
        if (arr[i] == key) {
            return i;
        }

        return isfound;
    }

    public static int powcal(int n, int x) {
        // Time Complexity O(n)
        if (n == 0) {
            return 1;
        }
        // int nm1 = powcal(n-1, x);
        // int xn = x * nm1;
        // return xn;

        return x * powcal(n - 1, x);
    }

    public static int optimisedpowcal(int x, int n) {
        if (n == 0) {
            return 1;
        }
        // Time Complexity O(logn)
        int halfpow = optimisedpowcal(x, n / 2);
        int halfpowsqare = halfpow * halfpow;
        // n is odd
        if (n % 2 != 0) {
            return x * halfpowsqare;
        }

        return halfpowsqare;
    }

    public static int tilingpb(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        // n is lenth of flor
        // 2 is width
        // size of tile is 2*1 manes height = 2 & width = 1
        // kam
        // vertical choise
        int fnm1 = tilingpb(n - 1);
        // Int Horizontal Choise
        int fnm2 = tilingpb(n - 2);

        int totalways = fnm1 + fnm2;
        // return totalways;
        return tilingpb(n - 1) + tilingpb(n - 2);

    }

    public static void removedupstr(String str, int index, StringBuilder sb, boolean map[]) {

        if (index == str.length()) {
            System.out.println(sb);
            return;
        }

        // eork

        char currchar = str.charAt(index);
        if (map[currchar - 'a'] == true) {
            // duplicate present
            removedupstr(str, index + 1, sb, map);
        } else {
            map[currchar - 'a'] = true;
            removedupstr(str, index + 1, sb.append(currchar), map);

        }
        // int index = 0;
        // String st = "abcdefghijklmnopqrstuvwxyz";
        // char[] arr = new char[26];
        // arr = st.toCharArray();
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

    }

    public static int friendspairpb(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // choise
        // int fnm1 = friendspairpb(n - 1);
        // // pair
        // int fnm2 = friendspairpb(n - 2);
        // int paireays = (n - 1) * fnm2;
        // // totalways
        // int ttways = fnm1 + paireays;
        // return ttways;
        return friendspairpb(n - 1) + (n - 1) * friendspairpb(n - 2);
    }

    public static void binarystringpb(String str, int n, int lastplace) {
        // print all Binary String of size N without onsecutive One Two One cant Come
        // Together
        // kam

        // if (lastplace == 0) {
        // // str.append(0);
        // binarystringpb(str.append("0"), n-1, 0);
        // binarystringpb(str.append("1"), n-1, 1);

        // }else{
        // binarystringpb(str.append("0"), n-1, 0);
        // }
        if (n == 0) {
            System.out.println(str);
            return;
        }

        binarystringpb(str + "0", n - 1, 0);
        if (lastplace == 0) {
            binarystringpb(str + "1", n - 1, 1);
        }

    }

    public static void printstr(String str) {
        str = "Hello I am Bhautik";
        StringBuilder sb = new StringBuilder(str);
        // sb.delete(1, 3);
        // sb.capacity();
        System.out.println(sb.substring(0, 4));
    }

    public static void coocurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return;
        }

        if (arr[i] == key) {
            System.out.println(i + " ");
        }
        coocurence(arr, key, i + 1);
    }

    public static void stringenglish(int num) {
        String digits[] = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
        if (num == 0) {
            return;
        }
        int lastdigit = num % 10;
        stringenglish(num / 10);
        System.out.println(digits[lastdigit] + " ");

    }

    public static int lenthofstr(String str) {
        if (str.length() == 0) {
            return 0;
        }

        return lenthofstr(str.substring(1)) + 1;
    }

    public static int countsubstr(String str, int i, int j, int n) {
        if (n == 1) {
            return 1;
        }
        if (n <= 0) {
            return 0;
        }
        n = str.length();

        int res = countsubstr(str, i + 1, j, n - 1) + countsubstr(str, i, j - 1, n - 1)
                - countsubstr(str, i + 1, j - 1, n - 2);
        if (str.charAt(i) == str.charAt(j)) {

            res++;

        }

        return res;
    }

    public static void towerofhonai(int n, String src , String hlper , String dest){
        if (n == 1) {
            System.out.println("Transfer Disk " + n + " from " + src + " To " + dest);
            return;
        }
      towerofhonai(n-1, src, dest, hlper);
      System.out.println("Transfer Disk " + n + " from " + src + " To " + dest);
      towerofhonai(n-1, hlper, src, dest);

    };
}
