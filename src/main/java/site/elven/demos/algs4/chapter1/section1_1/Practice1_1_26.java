package site.elven.demos.algs4.chapter1.section1_1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Practice1_1_26 {
    public static void main(String[] args) {
        int a = StdRandom.uniformInt(100);
        int b = StdRandom.uniformInt(100);
        int c = StdRandom.uniformInt(100);

        StdOut.printf("%4d%4d%4d\n", a, b, c);

        int t;
        if(a > b){
            t = a;
            a = b;
            b = t;
        }

        if (a > c){
            t = a;
            a = c;
            c = t;
        }

        if (b > c){
            t = b;
            b = c;
            c = t;
        }

        StdOut.printf("%4d%4d%4d\n", a, b, c);

    }
}
