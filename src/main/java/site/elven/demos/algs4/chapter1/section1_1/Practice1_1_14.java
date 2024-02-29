package site.elven.demos.algs4.chapter1.section1_1;

import edu.princeton.cs.algs4.StdOut;

public class Practice1_1_14 {
    public static void main(String[] args) {
        int n = 16;
        StdOut.println(lg(n));
        StdOut.println(logarithm(n));
        StdOut.println(Math.log(n));
    }

    public static int lg(int n){
        int r = 2;
        int i = 0;
        while (r <= n){
            r *= 2;
            i++;
        }

        return i;
    }

    public static int logarithm(int N){
        int result = 0;
        int product = 2;
        if(N==1)return 0;
        while(product<=N){
            product*=2;
            result++;
        }
        return result;
    }

}
