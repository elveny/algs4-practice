package site.elven.demos.algs4.chapter1.section1_1;

import edu.princeton.cs.algs4.StdOut;

public class Practice1_1_16 {
    public static void main(String[] args) {
        StdOut.println(exR1(3));
    }

    public static String exR1(int n){
        if(n <= 0){
            return "";
        }
        return exR1(n - 3) + n + exR1(n-2) + n;
    }
}
