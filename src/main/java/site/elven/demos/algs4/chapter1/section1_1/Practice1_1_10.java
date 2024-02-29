package site.elven.demos.algs4.chapter1.section1_1;

import edu.princeton.cs.algs4.StdOut;

public class Practice1_1_10 {
    public static void main(String[] args) {

        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = i * i;
            System.out.println(a[i]);
        }
        StdOut.println(a);


    }
}
