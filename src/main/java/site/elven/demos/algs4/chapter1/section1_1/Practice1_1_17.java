package site.elven.demos.algs4.chapter1.section1_1;

import edu.princeton.cs.algs4.StdOut;

public class Practice1_1_17 {
    public static void main(String[] args) {
        StdOut.println(exR2(4));
    }

    public static String exR2(int n){
        String s = exR2(n - 3) + n + exR2(n-2) + n;
        if(n <= 0){
            return "";
        }
        return s;
    }
}
