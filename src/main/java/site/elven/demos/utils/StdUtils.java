package site.elven.demos.utils;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

public class StdUtils {
    public static void printArr(int[] arr){
        Arrays.stream(arr).forEach(a -> StdOut.printf("%d\t", a));
        StdOut.println();
    }

    public static void printArr(double[] arr){
        Arrays.stream(arr).forEach(a -> StdOut.printf("%f\t", a));
        StdOut.println();
    }

    public static void printArr(String[] arr){
        Arrays.stream(arr).forEach(a -> StdOut.printf("%s\t", a));
        StdOut.println();
    }

    public static int[] getSortedIntArr(int len){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static int[] getRandomIntArr(int len, int seed){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = StdRandom.uniformInt(seed);
        }
        return arr;
    }

    public static int[][] getRandomIntArr(int row, int col, int seed) {
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = StdRandom.uniformInt(seed);
            }
        }
        return arr;
    }

    public static long[] getRandomLongArr(int len, long seed){
        long[] arr = new long[len];
        for (int i = 0; i < len; i++) {
            arr[i] = StdRandom.uniformLong(seed);
        }
        return arr;
    }

    public static long[][] getRandomLongArr(int row, int col, long seed) {
        long[][] arr = new long[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = StdRandom.uniformLong(seed);
            }
        }
        return arr;
    }

    public static double[] getRandomDoubleArr(int len, double seed){
        double[] arr = new double[len];
        for (int i = 0; i < len; i++) {
            arr[i] = StdRandom.uniformDouble(0.0, seed);
        }
        return arr;
    }

    public static double[][] getRandomDoubleArr(int row, int col, double seed) {
        double[][] arr = new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = StdRandom.uniformDouble(0.0, seed);
            }
        }
        return arr;
    }

    public static boolean[] getRandomBooleanArr(int len, double seed){
        boolean[] arr = new boolean[len];
        for (int i = 0; i < len; i++) {
            arr[i] = StdRandom.bernoulli(seed);
        }
        return arr;
    }

    public static boolean[][] getRandomBooleanArr(int row, int col, double seed) {
        boolean[][] arr = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = StdRandom.bernoulli(seed);
            }
        }
        return arr;
    }
}
