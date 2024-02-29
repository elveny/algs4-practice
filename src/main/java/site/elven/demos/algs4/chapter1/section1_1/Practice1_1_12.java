package site.elven.demos.algs4.chapter1.section1_1;

import edu.princeton.cs.algs4.StdOut;

public class Practice1_1_12 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = 9 - i;
            StdOut.print(a[i] + " ");
        }
        StdOut.println();

        for (int i = 0; i < 10; i++) {
            int index = a[i];
            StdOut.print("index:" + index + " ");
//            a[i] = a[a[i]];
            a[i] = a[index];
            StdOut.print("value a["+i+"] = a["+index+"]:" + a[i] + " \n");
        }
        StdOut.println();

        for (int i = 0; i < 10; i++) {
            StdOut.print(a[i] + " ");
        }
    }

}
