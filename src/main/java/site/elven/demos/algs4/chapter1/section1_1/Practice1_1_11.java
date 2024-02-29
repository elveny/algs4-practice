package site.elven.demos.algs4.chapter1.section1_1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Practice1_1_11 {
    public static void main(String[] args) {
        int m = 10;
        int n = 15;
        boolean[][] boolArr = getBooleans(m, n);
        StdOut.printf(" \t");
        for (int i = 0; i < n; i++) {
            StdOut.printf("%d\t", i+1);
        }
        StdOut.println();

        for (int i = 0; i < m; i++) {
            StdOut.printf("%d\t", i+1);
            for (int j = 0; j < n; j++) {
                StdOut.printf("%s\t", boolArr[i][j] ? "*" : "-");
            }
            StdOut.println();
        }

    }

    private static boolean[][] getBooleans(int m, int n) {
        boolean[][] boolArr = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                boolArr[i][j] = StdRandom.bernoulli();
            }
        }
        return boolArr;
    }
}
