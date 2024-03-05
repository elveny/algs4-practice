package site.elven.demos.algs4.chapter1.section1_1;

import site.elven.demos.utils.StdUtils;

public class Practice1_1_30 {

    public static void main(String[] args) {
        int n = 37;
        boolean[][] gen = gen(n);
        StdUtils.printArr(gen, n, n, "*", "-");

    }

    public static int factor(int m, int n){
        if(m == 0 || n == 0){
            return 1;
        }

        if(m % n == 0){
            return n;
        }

        return factor(n, m%n);
    }

    public static boolean[][] gen(int n){
        boolean[][] b = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = factor(i, j) != 1;
            }
        }
        return b;
    }
}
