package site.elven.demos.algs4.chapter1.section1_1;

import site.elven.demos.utils.StdUtils;

public class Practice1_1_15 {
    public static void main(String[] args) {
        int m = 15;

        int[] arr = StdUtils.getRandomIntArr(10, m);
        StdUtils.printArr(arr);

        int[] r = histogram(arr, m);
        StdUtils.printArr(r);
    }


    public static int[] histogram(int[] a, int m){
        int[] r = new int[m];

        for (int i = 0; i < m; i++) {
            int v = find(a, i);
            r[i] = v;
        }

        return r;
    }

    public static int find(int[] a, int i){
        int n = 0;
        for (int k : a) {
            if (k == i) {
                n++;
            }
        }
        return n;
    }


}
