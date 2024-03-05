package site.elven.demos.algs4.chapter1.section1_1;

import edu.princeton.cs.algs4.StdOut;
import site.elven.demos.utils.StdUtils;

public class Practice1_1_27 {

    private static int COUNT = 0;
    private static double[][] arr;

    public static void main(String[] args) {
//        StdOut.println(binomial(100, 50, 0.25));
        StdOut.println(newBinomial(100, 50, 0.25));
        StdOut.println(COUNT);
        for(double[] a : arr){
            StdUtils.printArr(a);
            StdOut.println();
        }
    }

    private static double fasterBinomial(int N, int k, double p) {
        COUNT++;
        StdOut.println(COUNT);
        if (N == 0 && k == 0) {
            return 1.0;
        }
        if (N < 0 || k < 0) {
            return 0.0;
        }
        if (arr[N][k] == -1) {  //将计算结果存起来，已经计算过的直接拿过来用，无需再递归计算
            arr[N][k] = (1.0 - p) * fasterBinomial(N - 1, k, p) + p * fasterBinomial(N - 1, k - 1, p);
        }
        StdOut.println(arr[N][k]);
        return arr[N][k];
    }

    public static double newBinomial(int N, int k, double p) {
        arr = new double[N + 1][k + 1];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= k; j++) {
                arr[i][j] = -1;
            }
        }
        return fasterBinomial(N, k, p);
    }

    public static double binomial(int n, int k, double p){
        if(n == 0 && k == 0) return 1.0;
        if(n < 0 || k < 0) return 0.0;
        return (1.0 - p) * binomial(n-1, k, p) + p * binomial(n-1, k-1, p);
    }
}
