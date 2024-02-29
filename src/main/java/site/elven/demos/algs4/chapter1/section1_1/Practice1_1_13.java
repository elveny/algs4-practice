package site.elven.demos.algs4.chapter1.section1_1;

import edu.princeton.cs.algs4.StdOut;

public class Practice1_1_13 {
    public static void main(String[] args) {
        int m = 10;
        int n = 15;
        int[][] arr = getArr(m, n);
        printArr(m, n, arr);

        int[][] transpose = transpose(m, n, arr);
        printArr(n, m, transpose);

    }

    private static void printArr(int m, int n, int[][] arr) {
        StdOut.printf(" \t");
        for (int i = 0; i < n; i++) {
            StdOut.printf("%d\t", i+1);
        }
        StdOut.println();

        for (int i = 0; i < m; i++) {
            StdOut.printf("%d\t", i+1);
            for (int j = 0; j < n; j++) {
                StdOut.printf("%s\t", arr[i][j]);
            }
            StdOut.println();
        }

        StdOut.println("----------------------------------------------------------------");

    }

    private static int[][] getArr(int m, int n) {
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = j;
//                arr[i][j] = StdRandom.uniformInt(Math.max(m, n));
            }
        }
        return arr;
    }

    private static int[][] transpose(int m, int n, int[][] arr){
        int[][] result = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = arr[j][i];
            }
        }

        return result;
    }
}
