package site.elven.demos.algs4.chapter1.section1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Practice1_1_21 {
    public static void main(String[] args) {
        String[] strings = StdIn.readAllLines();
        for (String string : strings) {
            String[] v = string.split(" ");
            String name = v[0];
            int i1 = Integer.parseInt(v[1]);
            int i2 = Integer.parseInt(v[2]);
            StdOut.printf("%s\t\t%d\t%d\t%.3f\t\n", name, i1, i2, (double) i1 / (double) i2);
        }


    }

}
